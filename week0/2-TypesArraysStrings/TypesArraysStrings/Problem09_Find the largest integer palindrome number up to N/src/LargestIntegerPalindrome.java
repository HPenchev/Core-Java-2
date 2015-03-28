//9. Find the largest integer palindrome number up to N
//long getLargestPalindrome(long N);
//1234321 is a palindrome. You are given a number => N.
//Find the largest number < N, that is a palindrome.
//Bonus do this without using Collections.sort

import java.util.ArrayList;
import java.util.List;

public class LargestIntegerPalindrome {

    public static void main(String[] args) {
        System.out.println(getLargestPalindrome(1000));
        System.out.println(getLargestPalindrome(9));
        System.out.println(getLargestPalindrome(-20));
    }
    
    @SuppressWarnings("null")
    public static long getLargestPalindrome(long n) {
        for (long i = n; i > Long.MIN_VALUE; i--) {
            if(isPalindrome(i)) {
                return i;
            }
        }
        
        return (Long) null;
    }
    
    public static boolean isPalindrome(long n) {
        List<Byte> digits = new ArrayList<Byte>();
        n = Math.abs(n);
        if (n <= 9) {
            return true;
        }
        
        while (n > 0) {
            byte digit = (byte) (n % 10);
            digits.add(digit);
            n /= 10;
        }
        
        int digitsToCheck = digits.size()  / 2 + 1;
        for (int i = 0; i < digitsToCheck; i++) {
            int positionToCompare = digits.size() - 1 - i;
            if (digits.get(i) != digits.get(positionToCompare)) {
                return false;
            }
        }
        
        return true;
    } 
}
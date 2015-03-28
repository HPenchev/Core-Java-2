import java.util.ArrayList;
import java.util.List;

public class NumberPalindromeChecker {
    public static void main(String[] args) {
        
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
 
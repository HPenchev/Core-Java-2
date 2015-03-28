
public class PalindromeStringChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("pesho"));

    }
    
    public static boolean isPalindrome(String argument) {
        String reversed = new StringBuilder(argument).reverse().toString();
        
        return reversed.equals(argument);
    }
}
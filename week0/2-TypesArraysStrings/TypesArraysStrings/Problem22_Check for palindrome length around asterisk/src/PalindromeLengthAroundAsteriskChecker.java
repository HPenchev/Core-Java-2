
public class PalindromeLengthAroundAsteriskChecker {

    public static void main(String[] args) {
        System.out.println(getPalindromeLength("taz*zad"));

    }

    public static int getPalindromeLength(String input) {
        int asteriskPosition = input.indexOf('*');
        
        if (asteriskPosition == -1) {
            throw new IllegalArgumentException("No * into input");
        }
        
        int palindromeLength = 0;
        int startPosition = asteriskPosition - 1;
        int endPosition = asteriskPosition + 2;
        int inputLength = input.length();
        String palindromeToCheck = null;
        
        while (startPosition >= 0 && endPosition <= inputLength) {
            palindromeToCheck = input.substring(startPosition, endPosition);
            if (!isPalindrome(palindromeToCheck)) {
                break;
            }
            
            startPosition --;
            endPosition ++;
            palindromeLength ++;
        }
        
        return palindromeLength;
    }
    
    private static boolean isPalindrome(String argument) {
        String reversed = new StringBuilder(argument).reverse().toString();
        
        return reversed.equals(argument);
    }
}

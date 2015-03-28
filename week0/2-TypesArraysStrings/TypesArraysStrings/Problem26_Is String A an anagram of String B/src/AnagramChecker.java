
public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(areAnagrams("a", "a"));
        System.out.println(areAnagrams("pesho", "shpoe"));
        System.out.println(areAnagrams("aaabb", "aabbb"));

    }
    
    public static boolean areAnagrams(String a, String b) {
        int length = b.length();
        
        if (length != a.length()) {
            return false;
        }
        
        for (int i = 0; i < length; i++) {
            char charToCheck = b.charAt(i);
            
            if (occurrenceCount(charToCheck, b) != occurrenceCount(charToCheck, a)) {
                return false;
            }
        }
        
        return true;
    }
    
    private static int occurrenceCount(char charToCheck, String word) {
        int length = word.length();
        int charOccurrences = 0;
        
        for (int i = 0; i < length; i++) {
            if (charToCheck == word.charAt(i)) {
                charOccurrences++;
            }
        }
        
        return charOccurrences;
    }
}    
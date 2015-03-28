public class SubstringAnagramChecker {

    public static void main(String[] args) {
        System.out.println(hasAnagramOf("dirac", "libcarid"));
    }

    public static boolean hasAnagramOf(String a, String b) {
        int lengthA = a.length();
        int finalPointToLoop = b.length() - lengthA + 1;

        for (int i = 0; i < finalPointToLoop; i++) {
            String substringToCheck = b.substring(i, i + lengthA);
            if (AnagramChecker.areAnagrams(a, substringToCheck)) {
                return true;
            }
        }

        return false;
    }
}
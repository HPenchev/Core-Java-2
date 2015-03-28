
public class CharacterRepeater {

    public static void main(String[] args) {
        System.out.println(copyEveryChar("pesho", 3));

    }

    public static String copyEveryChar(String input, int k) {
        int length = input.length();
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < k; j++) {
                builder.append(input.charAt(i));
            }
        }
        
        return builder.toString();
    }
}

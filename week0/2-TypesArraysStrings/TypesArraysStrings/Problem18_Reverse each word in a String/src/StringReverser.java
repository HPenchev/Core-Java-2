import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringReverser {

    public static void main(String[] args) {
        System.out.println(reverseEveryWord("What is this"));
    }

    public static String reverseEveryWord(String arg) {
        List<String> words = new ArrayList<String>();
        Pattern pattern = Pattern.compile("[^\\s]+");
        Matcher matcher = pattern.matcher(arg);
        
        while (matcher.find()) {
            words.add(matcher.group());
        }
        
        int length = words.size();        
        for (int i = 0; i < length; i++) {
            String reversed = new StringBuilder(words.get(i)).reverse().toString();
            words.set(i, reversed);
        }
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <length; i++) {
            output.append(words.get(i) + " ");
        }
        
        return output.toString().trim();
    }
}
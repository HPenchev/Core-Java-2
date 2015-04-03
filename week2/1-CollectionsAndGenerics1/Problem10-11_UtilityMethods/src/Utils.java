import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {
    public static String convertMapToString(Map<?, ?> map) {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            output.append(entry.getKey().toString() + ": " + entry.getValue().toString());
            output.append("\n");
        }     
        
        return output.toString();
    }
    
    
    //method is case-sensitive and returns letters and numbers only, no signs.
    public static LinkedHashMap<String, Integer> countWords (String text) {
        LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        
        while(matcher.find()) {
            String word = matcher.group();
            
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        
        return words;
    }
}
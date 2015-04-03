import java.util.Map;


public class TestUtils {

    public static void main(String[] args) {
        String text = "Ninjas are all over the place! We are all going to die!";
        Map<String, Integer> wordsCount = Utils.countWords(text);
        System.out.println(Utils.convertMapToString(wordsCount));
    }
}
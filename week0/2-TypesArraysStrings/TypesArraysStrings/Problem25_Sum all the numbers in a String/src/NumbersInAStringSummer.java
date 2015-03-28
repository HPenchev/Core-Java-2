import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInAStringSummer {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("abc123dd34"));
        System.out.println(sumOfNumbers("12 99 1"));
    }

    public static int sumOfNumbers(String input) {
        Pattern pattern = Pattern.compile("\\-?\\d+");
        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        
        return sum;
    }
}
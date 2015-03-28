public class ReverseAString {

    public static void main(String[] args) {
        String str = "Pesho";
        String reversed = reverseMe(str);
        System.out.println(reversed);
    }

    public static String reverseMe(String argument) {
        String reversed = new StringBuilder(argument).reverse().toString();
        return reversed;
    }
}
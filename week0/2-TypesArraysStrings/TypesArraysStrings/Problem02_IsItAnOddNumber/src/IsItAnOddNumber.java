
public class IsItAnOddNumber {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(3));
    }
    
    public static boolean isOdd(int n) {
        return n%2 != 0;
    }

}
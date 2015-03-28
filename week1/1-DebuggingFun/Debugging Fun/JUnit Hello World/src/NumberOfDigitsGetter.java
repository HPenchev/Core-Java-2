
public class NumberOfDigitsGetter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static int getNumberOfDigits(int number) {
        if (number == 0) {
            return 1;
        }
        
        int numberOfDigits = 0;
        
        while (number != 0) {
            number /= 10;
            numberOfDigits ++;
        }
        
        return numberOfDigits;
    }
}

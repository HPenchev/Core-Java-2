
public class DoubleFactorial {

    public static void main(String[] args) {
        System.out.println(doubleFac(3));

    }

    public static long doubleFac(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        long doubleFactorial = factorial;
        
        for (long i = n + 1; i <= factorial; i++) {
            doubleFactorial *= i;
        }
        
        return doubleFactorial;
    }        
}
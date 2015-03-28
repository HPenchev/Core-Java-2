
public class IntegerToAPowerOfAnother {

    public static void main(String[] args) {
        System.out.println(pow(5, 5));
    }
    
    public static long pow (int a, int b) {
        if (b < 0) {
            if (Math.abs(a) != 1) {
                throw new IllegalStateException("The result is not a number of type Long");
            } else {
                return pow(a, -b);
            }
        } else if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b % 2 == 0) {
            return pow (a * a, b / 2);
        } else {
            return a * pow (a * a, (b-1) / 2);
        }
    }
    
    //this method is faster but desn't work with negative numbers
    public static long powBitOperation(int a, int b) { 
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Method works non-negative numbers only.");
        }
        long base = a;
        long exp = b;
        long result = 1;
        
        while (exp != 0)
        {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }

        return result;
    }
    
    
}

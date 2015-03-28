
public class SmallestMultiple {

    public static void main(String[] args) {
        System.out.println(getSmallestMultiple(8));
    }

    public static long getSmallestMultiple(int upperBound) {
        long smallestMultible = getSmallestMultibleOfTwoNumbers(upperBound, upperBound - 1);
        
        for (int i = upperBound; i > 0; i--) {
            smallestMultible = getSmallestMultibleOfTwoNumbers(smallestMultible, i);
        }
        
        return smallestMultible;
    }
    
    private static long getSmallestMultibleOfTwoNumbers(long a, long b) {
        long number = Math.max(a, b);        
        long longMax = Long.MAX_VALUE;
        
        for (long i = number; i < longMax; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        
        throw new IllegalStateException("No multible of numbers within long range");
    }
}
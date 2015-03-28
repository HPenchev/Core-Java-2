import java.util.Arrays;

//13. Maximal scalar product
//long maximalScalarSum(int[] a, int[] b) You are given two vectors, a and b.
//Let a be {a1,a2,a3} and b be {b1,b2,b3}. 
//The scalar product of vectors a and b is the number a1*b1 + a2*b2 + a3*b3
//Find a permutation of a, and a permutation of b, 
//for which their scalar product is the largest possible.

public class MaximalScalarProduct {

    public static void main(String[] args) {
        long number = maximalScalarSum(new int[]{20, 2, -1}, new int[]{4, 19, 7});
        System.out.println(number);
    }
    
    public static long maximalScalarSum(int[] a, int[] b) {                
        Arrays.sort(a);
        Arrays.sort(b);
        int length = a.length;
        long scalarSum = 0;
        
        for (int i = 0; i < length; i++) {
            scalarSum += a[i] * b[i];
        }
        
        return scalarSum;
    }
    
    
}
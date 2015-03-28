import java.util.Arrays;

public class FindTheKthMinimalElementOfAnArray {

    public static void main(String[] args) {
        System.out.println(kthMin(3, new int[] {3, 5, 2, 7, 6, 0, 5, 1}));
    }
    
    public static int kthMin (int k, int[] array) {
        if (array.length < k) {
            throw new IllegalArgumentException("Array doesn't have enough numbers");
        }
        
        Arrays.sort(array);
        return array[k - 1];
    }
}
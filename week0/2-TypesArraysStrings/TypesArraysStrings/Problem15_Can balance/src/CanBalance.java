
public class CanBalance {

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }

    public static boolean canBalance(int[] numbers) {
        int length = numbers.length;
        
        if (length <= 1) {
            return false;
        }
        
        int firstHalf = 0;
        int secondHalf = 0;
        
        for (int i = 1; i < length; i++) {
            firstHalf = 0;
            secondHalf = 0;
            for (int j = 0; j < length; j++) {
                if (j < i) {
                    firstHalf += numbers[j];
                } else {
                    secondHalf += numbers[j];
                }
            }
            
            if (firstHalf == secondHalf) {
                return true;
            }
        }
        
        return false;
    }
}
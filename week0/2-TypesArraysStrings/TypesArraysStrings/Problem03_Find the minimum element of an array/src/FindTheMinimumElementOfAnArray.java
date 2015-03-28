public class FindTheMinimumElementOfAnArray {

    public static void main(String[] args) {
        System.out.println(min(new int[]{3, 5, 2, 5, 6, 0, 5, 1}));
    }
    
    public static int min(int[] array) {
        int minValue = Integer.MAX_VALUE;
        
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        
        return minValue;
    }
}
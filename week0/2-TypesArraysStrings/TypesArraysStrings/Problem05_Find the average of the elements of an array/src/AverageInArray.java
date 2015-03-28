public class AverageInArray {

    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{3, 5, 2, 5, 6, 0, 5, 1}));
    }
    
    public static float getAverage(int[] array) {
        float sum = 0f;
                
        for (int i : array) {
            sum += i;
        }
        
        float average = sum/array.length;        
        return average;
    }
}
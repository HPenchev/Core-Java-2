
public class MaxSpan {

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));

    }
    
    public static int maxSpan(int[] numbers) {
        int maxSpan = 0;
        int span = 0;
        int startPosition = 0;
        int endPosition = 0;
        int length = numbers.length;
        
        for (int i = 0; i < length; i++) {
            startPosition = i;
            for (int j = i; j < length; j++) {
                if (numbers[j] == numbers[i]) {
                    endPosition = j;
                }
                
                span = endPosition - startPosition + 1;
                if (span > maxSpan) {
                    maxSpan = span;
                }
            }
        }
        
        return maxSpan;
    }
}

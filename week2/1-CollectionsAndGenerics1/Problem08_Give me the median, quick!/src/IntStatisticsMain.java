import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntStatisticsMain {

    public static void main(String[] args) {
        List<Integer> numbers = 
                new ArrayList<Integer>(Arrays.asList(13, 18, 13, 14, 13, 16, 14, 21, 13));        
        testStatistics(numbers);
        
        numbers = new ArrayList<Integer>(Arrays.asList(13, 13, 13, 13, 14, 14, 16, 18, 21));        
        testStatistics(numbers);
        
        numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 7));        
        testStatistics(numbers);
        
        numbers = new ArrayList<Integer>(Arrays.asList(8, 9, 10, 10, 10, 11, 11, 11, 12, 13));        
        testStatistics(numbers);
    }

    private static void testStatistics(List<Integer> numbers) {
        IntStatistics stat = new IntStatistics(numbers);
        
        System.out.println(stat.getMean());
        System.out.println(stat.getMedian());
        System.out.println(stat.getMode());
        System.out.println(stat.getRange());
        for (Integer num : stat) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//12. Find the only number, that occurs odd times in an array
//int getOddOccurrence(int... array)
//Every element in array will occur an even ammount of times. 
//There will be exactly one element 
//Example: {1,2,2,1,3,4,3,4,4,6,5,6,5} => 4 occurs only an odd number of times.

public class NumberOddTimeOccurence {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,3,4,4,6,5,6,5};
        int numberOccuringOddTimes = getOddOccurrence(arr);
        System.out.println(numberOccuringOddTimes);
    }
    
    public static int getOddOccurrence(int[] numbers) {
        int counter = 0;
        for (int numberToCount : numbers) {
            counter = 0;
            for (int number : numbers) {
                if (numberToCount == number) {
                    counter ++;
                }
            }
            
            if (counter % 2 != 0) {
                return numberToCount;
            }
        }
        
        throw new IllegalArgumentException("Array does not contain a number" + 
        " that occures odd times");
    }
}

import java.util.Arrays;
import java.util.Collection;


public class UniqueElementFinder {
    public static void main(String[] args) {
        Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
        System.out.println(findFirstUiqueElement(ints));
    }
 
    public static Integer findFirstUiqueElement(Collection<Integer> collection) {        
        int occurences = 0;
        
        for (Integer number : collection) {
            occurences = 0;
            for (Integer numberToCompare : collection) {                
                if (number.equals(numberToCompare)) {
                    occurences ++;
                }
            }
            
            if (occurences == 1) {
                return number;
            }
        }
        
        return null;
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesFinder {

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(4,5,6));
        Set<Integer> c = new HashSet<Integer>(Arrays.asList(5,6,7,8));
        
        Set<Integer> duplicates = getDuplicateElements(a, b, c);
        
        for (Object object : duplicates) {
            System.out.println(object);
        }                  
    }
    
    @SafeVarargs
    public static <T> Set<T> getDuplicateElements(Set<T>... sets) {
        Set<T> duplicatedElements = new HashSet<T>();
        
        Set<T> firstSet = sets[0];
        boolean isDuplicated = true;
        
        for (T element : firstSet) {
            isDuplicated = true;
            for(Set<?> set : sets) {
                if (!set.contains(element)) {
                    isDuplicated = false;
                    break;
                }
            }
            
            if (isDuplicated) {
                duplicatedElements.add(element);
            }
        }
        
        return duplicatedElements;
    }
}
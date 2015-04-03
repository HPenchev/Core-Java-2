import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


public class CollectionReverser {

    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        
        reverse(set);
        
        for (Integer number : set) {
            System.out.println(number);
        }
    }
    
    public static <T> void reverse (Collection<T> collection) {
       
        List<T> newCollection = new ArrayList<T>();
        for (T element : collection) {
            newCollection.add(element);            
        }
        
        collection.clear();
        
        for (int i = newCollection.size() - 1; i >= 0; i--) {
            collection.add(newCollection.get(i));
        }
    }
}
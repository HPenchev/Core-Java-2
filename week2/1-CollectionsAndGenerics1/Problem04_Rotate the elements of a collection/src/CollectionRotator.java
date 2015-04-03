import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class CollectionRotator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>
        (Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

        rotate(list, -1);
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static <T> void rotate(Collection<T> collection, int rotateStep ) {
        List<T> list = new ArrayList<T>();
        
        list.addAll(collection);
        collection.clear();        
           
        if (rotateStep > 0) {
            for (int i = list.size() - rotateStep; i < list.size(); i++) {
                collection.add(list.get(i));
            }
            
            for (int i = 0; i < list.size() - rotateStep; i++) {
                collection.add(list.get(i));
            } 
        } else {
            for (int i = 0 - rotateStep; i < list.size(); i++) {
                collection.add(list.get(i));
            }
            
            for (int i = 0; i < 0 - rotateStep; i++) {
                collection.add(list.get(i));
            }
        }
    }
}
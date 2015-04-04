import static org.junit.Assert.*;

import org.junit.Test;


public class ImmutableListTest {

    @Test
    public void test() {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11, 12};
        int[] arr3 = {13, 14, 15,16,17,18};
        
        ImmutableList<int[]> list = ImmutableList.asList(arr1, arr2, arr3);
        arr1 = new int[]{0, 0, 0, 0, 0, 0};
        int[] arr4 = list.get(0);
        arr4[3] = 1;
        int[] arr5 = list.get(0);
        
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr5);
    }
}
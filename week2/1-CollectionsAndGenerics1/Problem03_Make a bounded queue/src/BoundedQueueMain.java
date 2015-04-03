import java.util.Queue;


public class BoundedQueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new BoundedQueue<Integer>(10);
        
        for(int i = 0; i < 20; i ++) {
            queue.add(i);
        }
        
        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }

}


public class KthFactorial {

    public static void main(String[] args) {
        System.out.println(kthFac(2, 9));

    }
    
    public static long kthFac(int k, int n) {
        long factorial = 1;
        
        for (int i = n; i > 0; i -= k) {
            factorial *= i;
        }
        
        return factorial;
    }
}

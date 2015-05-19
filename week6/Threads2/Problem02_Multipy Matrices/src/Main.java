
public class Main {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        
        Matrix a = Utils.generateMatrix(1000, 1000, -50000, 50000);
        Matrix b = Utils.generateMatrix(1000, 1000, -50000, 50000);
        Matrix c = Utils.multiplyMatrices(a, b);
        
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

}

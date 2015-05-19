
public class MatrixCalculator extends Thread {
    private Matrix a;
    private Matrix b;
    private Matrix newMatrix;
    MatrixCalculator(Matrix a, Matrix b, Matrix newMatrix){
        this.a = a;
        this.b = b;
        this.newMatrix = newMatrix;
    }
    @Override
    public void run() {
        //int currentRow = 0;
        while (true) {            
            int currentRow = Utils.getNextRow();
            if (currentRow >= newMatrix.getMatrix().length) {
                break;
            }
            
            //System.out.println(currentRow);
            Utils.calculateRow(a, b, newMatrix, currentRow);
        }
    }
    
    
}

import java.util.Random;


public class Utils {
    private static volatile int nextRow = 0;
    
    public static Random rnd = new Random();
    public static Matrix generateMatrix(int rows, int columns, int minNumber, int maxNumber) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(maxNumber + minNumber + 1) - minNumber;
            }
        }
        
        return new Matrix(array);
    }

    public static Matrix multiplyMatrices(Matrix a, Matrix b) throws InterruptedException {
        if (a.getMatrix()[0].length != b.getMatrix().length) {
            return null;
        }
        
        int newMatrixRows = a.getMatrix().length;
        int newMatrixColumns = b.getMatrix()[0].length;        
        Matrix newMatrix = new Matrix(new int[newMatrixRows][newMatrixColumns]);
//        
//        for (int i = 0; i < newMatrixRows; i++) {
//            calculateRow(a, b, newMatrixColumns, newMatrix, i);            
//        }
        Thread threadOne = new MatrixCalculator(a, b, newMatrix);
        Thread threadTwo = new MatrixCalculator(a, b, newMatrix);
        Thread threadThree = new MatrixCalculator(a, b, newMatrix);
        Thread threadFour = new MatrixCalculator(a, b, newMatrix);
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();
        
        return newMatrix;
    }
    
    public static int getNextRow() {
        return ++nextRow;
    }

    public static void calculateRow(Matrix a, Matrix b, Matrix newMatrix, int i) {
        int newMatrixColumns = b.getMatrix()[0].length;
        
        for (int j = 0; j < newMatrixColumns; j++) {
            int[] rowOfNumbers = a.getMatrix()[i];
            int number = getNumber(rowOfNumbers, j, b);
            
            newMatrix.getMatrix()[i][j] = number;
        }
    }    
    
    private static int getNumber(int[] rowOfNumbers, int column, Matrix b) {
        int length = rowOfNumbers.length;
        int sum = 0;
        
        for (int i = 0; i < length; i++) {
            int firstMultiplier = rowOfNumbers[i];
            int secondMultiplier = b.getMatrix()[i][column];
            sum += firstMultiplier * secondMultiplier;
        }
        
        return sum;
    }
}

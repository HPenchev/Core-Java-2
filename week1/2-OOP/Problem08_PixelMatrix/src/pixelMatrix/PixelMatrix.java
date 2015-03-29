package pixelMatrix;

public class PixelMatrix {
    private Pixel[][] matrix;    
    
    public PixelMatrix(Pixel[][] matrix) {       
        this.matrix = matrix;
    }
    
    public PixelMatrix(int width, int height) {       
        this.matrix = new Pixel[height][width];
    }

    public Pixel[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(Pixel[][] matrix) {
        this.matrix = matrix;
    } 
    
    public void setPixel(int x, int y, Pixel pixel) {
        this.matrix[x][y] = pixel;
    }
    
    public Pixel getPixel(int x, int y) {
        return this.matrix[x][y];
    }
    
    public void operate(MatrixOperation operation) {
        int heigh = this.matrix.length;
        int width = this.matrix[0].length;
        Pixel[][] newMatrix = new Pixel[heigh][width];        
        for (int i = 0; i < heigh; i++) {            
            for (int j = 0; j < width; j++) {
                Pixel pixel = operation.withPixel(i, j, this.matrix);
                newMatrix[i][j] = pixel;
            }
        }
        
        this.matrix = newMatrix;
    }

    @Override
    public String toString() {
        int height = this.matrix.length;
        int width = this.matrix[0].length;
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output.append(this.matrix[i][j].toString() + " ");
            }
            
            output.append("\n");
        }
        
        return output.toString();
    }    
}
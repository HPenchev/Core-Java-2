package pixelMatrix;

public class BrightnessReducer implements MatrixOperation {

    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        Pixel originalPixel = matrix[x][y];
        Pixel pixel = new Pixel(originalPixel.r/2, originalPixel.g/2, originalPixel.b/2);                
        return pixel;
    }
}
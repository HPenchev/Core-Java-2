package pixelMatrix;

public class GrayscaleConverter implements MatrixOperation {

    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        Pixel originalPixel = matrix[x][y];
        float average = (originalPixel.r + originalPixel.g + originalPixel.b) / 3;
        Pixel pixel = new Pixel(average * 0.2989f, average * 0.5870f, average * 0.1140f);                
        return pixel;
    }
}
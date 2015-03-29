package pixelMatrix;

public class PixelMain {

    public static void main(String[] args) {
        PixelMatrix matrix = new PixelMatrix(4, 4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix.setPixel(i, j, new Pixel(100f, 100f, 100f));                
            }
        }
        
        matrix.operate(new GaussianBlur());
        
        System.out.println(matrix);
    }
}
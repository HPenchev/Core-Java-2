
public class NearestNeighbourInterpolation {

    public static void main(String[] args) {
        int[][] original = new int[100][100];
        int counter = 0;
        for (int y = 0; y < original.length; y++) {
            for (int x = 0; x < original[0].length; x++) {
                original[y][x] = counter++;
            }
        }

        final int newWidth = 10;
        final int newHeight = 10;

        final int[][] newImage = NearestNeighbourInterpolation.rescale(
                original, 
                newWidth, 
                newHeight
                );
    }
    
    public static int[][] rescale(int[][] original, int newWidth, int newHeight) {
        int originalWidth = original[0].length;
        int originalHeight = original.length;
        double scaleHeight = (double)newHeight/originalHeight;
        double scaleWidth = (double)newWidth/originalWidth;
        
        int[][] newImage = new int[newHeight][newWidth];
        int pixelWidth = -1;
        int pixelHeight = -1;
        
        for (int i = 0; i < newHeight; i++) {
            pixelHeight = (int)(i / scaleHeight);
            for (int j = 0; j < newWidth; j++) {
                pixelWidth = (int)(j / scaleWidth);                
                int pixel = original[pixelHeight][pixelWidth];
                newImage[i][j] = pixel;
            }
        }
        
        return newImage;
    }
}

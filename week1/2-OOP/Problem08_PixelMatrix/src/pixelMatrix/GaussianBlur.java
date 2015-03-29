package pixelMatrix;

public class GaussianBlur implements MatrixOperation {
    public static final int RADIUS = 1;
    public static final float NORMAL_DISTRIBUTION_WEIGHT = 1.5F;
    public static final float[][] WEIGHT_MATRIX = 
            initiateWeightMatrix(RADIUS, NORMAL_DISTRIBUTION_WEIGHT);
    public static final int CELLS_IN_MATRIX = (int)(Math.pow((2*RADIUS +1), 2));
    
    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        Pixel pixelForReplacement = new Pixel(0f, 0f, 0f);
        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;
        int numberOfPixels = 0;
        
        for (int i = y - RADIUS; i <= y + RADIUS; i++) {
            if (i < 0 || i >= matrixHeight) {
                continue;
            }
            
            for (int j = x - RADIUS; j <= x + RADIUS; j++) {
                if (j < 0 || j >= matrixWidth) {
                    continue; 
                }
                
                Pixel weightenedPixel = matrix[i][j];
                float weight = WEIGHT_MATRIX[i - (y - RADIUS)][j - (x - RADIUS)];
                
                addWeight(pixelForReplacement, weightenedPixel, weight);
                
                numberOfPixels ++;
            }
        }
        
        addWeightForMissingCells(pixelForReplacement, numberOfPixels);
        
        return pixelForReplacement;
    }
    
    private static float[][] initiateWeightMatrix(int radius, float normalDistributionWeight) {
        int width = 2 * radius + 1;
        int height = 2 * radius + 1;
        double multiplierOne = 
                1 / (2 * Math.PI * NORMAL_DISTRIBUTION_WEIGHT * NORMAL_DISTRIBUTION_WEIGHT);
        float[][] weightMatrix = new float[height][width];
        for (int i = 0; i < height; i++) {
            int y = i - radius;
            for (int j = 0; j < width; j++) {
                int x = j - radius;
                
                double exponent = 
                        - (x * x + y * y) /
                        (2 * NORMAL_DISTRIBUTION_WEIGHT * NORMAL_DISTRIBUTION_WEIGHT);
                double multiplierTwo = Math.exp(exponent);
                
                float weight = (float)(multiplierOne * multiplierTwo);
                weightMatrix[i][j] = weight;
            }
        }
        
        return weightMatrix;
    }
    
    private void addWeight(Pixel originalPixel, Pixel weightenedPixel, float weight) {
        originalPixel.r += weightenedPixel.r * weight;
        originalPixel.g += weightenedPixel.g * weight;
        originalPixel.b += weightenedPixel.b * weight;
    }
    

    private void addWeightForMissingCells(Pixel pixelForReplacement, int numberOfPixels) {
        pixelForReplacement.r = 
                pixelForReplacement.r / numberOfPixels + 
                (CELLS_IN_MATRIX - numberOfPixels) * (pixelForReplacement.r / numberOfPixels);
        pixelForReplacement.g =
                pixelForReplacement.g / numberOfPixels +
                (CELLS_IN_MATRIX - numberOfPixels) * (pixelForReplacement.g / numberOfPixels);
        pixelForReplacement.b += 
                pixelForReplacement.b / numberOfPixels +
                (CELLS_IN_MATRIX - numberOfPixels) * (pixelForReplacement.b / numberOfPixels);
    }   
}
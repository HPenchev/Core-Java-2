//A histogram is a representation of distribution of some data.
//Here you receive a grayscale image matrix (image). 
//Each of the matrix's values will be between 0 and 255. 
//Return an array result, which is a histogram of image => 
//the value of result[i] should be the ammount of times i is in the matrix image.

public class GrayscaleImageHistogram {

    public static void main(String[] args) {
        short[][] image = {{0, 1, 2, 2}, {4, 4, 4, 4}, {3, 3, 3, 3}};
        int[] histogram = histogram(image);
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + " -> " + histogram[i]);
        }
    }

    public static int[] histogram(short[][] image) {
        short grayscaleShades = 255;
        int[] histogram = new int[256];
        
        for (short i = 0; i < grayscaleShades; i++) {
            int shade = takeShadeFrequency(i, image);
            histogram[i] = shade;
        }
        
        return histogram;
    }
    
    private static int takeShadeFrequency(short i, short[][] image) {
        int counter = 0;
        
        for (short[] row : image) {
            for (short number : row) {
                if (number == i) {
                    counter++;
                }
                    
            }
        }
        
        return counter;
    }
}
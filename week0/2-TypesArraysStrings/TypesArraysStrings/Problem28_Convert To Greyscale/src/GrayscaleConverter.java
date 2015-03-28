import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class GrayscaleConverter {

    public static void main(String[] args) throws IOException {
        convertToGreyscale("img.jpg");
    }

    public static void convertToGreyscale(String imgPath) throws IOException {
        File imageFile = new File(imgPath);
        BufferedImage image = ImageIO.read(imageFile);
        int height = image.getHeight();
        int width = image.getWidth();
        Color color = null;
        int red = 0;
        int blue = 0;
        int green = 0;
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                color = new Color(image.getRGB(i, j));
                red = (int) (color.getRed() * 0.21);
                green = (int) (color.getGreen() * 0.71);
                blue = (int) (color.getBlue() * 0.07);
                int gray = (red + green + blue)/3;
                color = new Color(gray, gray, gray);
                image.setRGB(i, j, color.getRGB());
            }
        }
        
        String extention = getFileExtention(imgPath);
        ImageIO.write(image, extention, imageFile);
    }
    
    private static String getFileExtention(String imgPath) {
        String[] files = imgPath.split("\\.");
        return files[files.length - 1];
    }
}
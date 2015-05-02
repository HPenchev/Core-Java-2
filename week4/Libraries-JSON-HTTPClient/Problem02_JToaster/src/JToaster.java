

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;


public class JToaster {
    public static void setComputerBreakToaster() throws InterruptedException {
        Toaster toasterManager = new Toaster();
        toasterManager.setToasterWidth(617);
        toasterManager.setToasterHeight(416);        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("nerd.jpg"));
            toasterManager.setBackgroundImage(img);
        } catch (IOException e) {
            System.out.println("No image found");
        }       
        
        toasterManager.setStep(10);
        Font f = new Font("Arial", Font.BOLD, 25);
        toasterManager.setToasterMessageFont(f);
        
        while(true) {
            Thread.sleep(2700);
            
            toasterManager.showToaster( "Go pick up some girls, you nerd!!!" );
        }       
    }
}
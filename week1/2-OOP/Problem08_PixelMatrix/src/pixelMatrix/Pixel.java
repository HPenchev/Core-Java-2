package pixelMatrix;

public class Pixel {
    public float r;
    public float g;
    public float b;
    
    public Pixel() {}

    public Pixel(float r, float g, float b) {
        super();
        this.r = r;
        this.g = g;
        this.b = b;
        
        
    }

    @Override
    public String toString() {
        String output = "#";
        output += String.format("%02X%02X%02X", (int)(this.r), (int)(this.g), (int)(this.b));
        return output;
    }    
}
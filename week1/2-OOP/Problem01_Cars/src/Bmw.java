
public class Bmw extends Car {
    private static final String BRAND = "BMW";
    public Bmw() {
        super(BRAND);        
    }
    
    public Bmw(String model) {
        super(BRAND, model);
    }
    
    public Bmw(String model, int mileage) {
        super(BRAND, model, mileage);
    }
}
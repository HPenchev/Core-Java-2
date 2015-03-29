
public class Mercedes extends Car {
    private static final String BRAND = "Mercedes";
    public Mercedes() {
        super(BRAND);        
    }
    
    public Mercedes(String model) {
        super(BRAND, model);
    }
    
    public Mercedes(String model, int mileage) {
        super(BRAND, model, mileage);
    }
}
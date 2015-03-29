
public class Wallkswagen extends Car {
    private static final String BRAND = "Walkswagen";
    public Wallkswagen() {
        super(BRAND);        
    }
    
    public Wallkswagen(String model) {
        super(BRAND, model);
    }
    
    public Wallkswagen(String model, int mileage) {
        super(BRAND, model, mileage);
    }
}
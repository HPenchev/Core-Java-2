
public class Audi extends Car {
    private static final String BRAND = "Audi";
    public Audi() {
        super(BRAND);        
    }
    
    public Audi(String model) {
        super(BRAND, model);
    }
    
    public Audi(String model, int mileage) {
        super(BRAND, model, mileage);
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\nMileage: " + this.getMileage();
        return output;
    }
    
    
}

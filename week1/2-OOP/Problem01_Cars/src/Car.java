
public abstract class Car {
    public String brand;
    public String model;
    public int mileage;       
    
    public Car(String brand) {        
        setBrand(brand);
    }
    
    public Car(String brand, String model) {
        this(brand);
        setModel(model);
    }
    
    public Car(String brand, String model, int mileage) {
        this(brand, model);
        setMileage(mileage);
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Milleage has to be more than 0");
        }
        
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        String output = "Brand: " + this.getBrand() + "\nModel: " + this.getModel();
        return output;
    }    
}

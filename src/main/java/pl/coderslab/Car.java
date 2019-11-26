package pl.coderslab;

public class Car extends Vehicle {
    public Car(Integer maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

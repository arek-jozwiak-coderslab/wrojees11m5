package pl.coderslab;

public class Main1 {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        Car car = new Car(170, "Passat", "kombi");
        Train pendpolino = new Train(250, "Pendpolino", 1435);

        vehicles[0] = car;
        vehicles[1] = pendpolino;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}

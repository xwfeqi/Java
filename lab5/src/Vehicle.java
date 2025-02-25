public class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }
}

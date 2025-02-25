interface Movable {
    void move();
}
class CarMovable extends Vehicle implements Movable {
    CarMovable(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike implements Movable {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

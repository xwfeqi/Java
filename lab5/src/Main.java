public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.toString());
        dog.makeSound();

        Cat cat = new Cat("Kitty");
        cat.makeSound();

        CarMovable car = new CarMovable("Tesla");
        car.displayInfo();
        car.move();

        Bike bike = new Bike();
        bike.move();

        Phone phone = new Phone();
        phone.turnOn();

        Laptop laptop = new Laptop();
        laptop.turnOn();
    }
}
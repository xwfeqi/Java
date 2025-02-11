public class Main {
    public static void main(String[] args) {
        One one = new One(10, 20.5, "Test");
        Two two = new Two("Alice", 25, true);
        Three three = new Three(2.5, 3.5, 4.5);

        one.displayValues();
        System.out.println("Sum: " + one.calculateSum());

        two.printDetails();
        System.out.println("Age in decades: " + two.ageInDecades());

        three.showCoordinates();
        System.out.println("Product: " + three.calculateProduct());

        three.receiveObject(one);
    }
}

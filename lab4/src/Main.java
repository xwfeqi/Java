public class Main {
    public static void main(String[] args) {
        One obj1 = new One(10);
        One obj2 = new One(10.5);
        One obj3 = new One("20");
        One obj4 = new One();

        Two objTwo = new Two(5.5);
        Three objThree = new Three("Hello");

        obj1.method(5);
        obj1.method(5.5);
        objTwo.method(3);
        objTwo.method(3.3); 
        objThree.method(2);
        objThree.method(2.2);

        obj1.uniqueMethod();
        objTwo.uniqueMethod();
        objThree.uniqueMethod();
    }
}
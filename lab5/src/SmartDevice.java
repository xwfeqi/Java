interface SmartDevice {
    default void turnOn(){
        System.out.println("Turning on");
    }
}

class Phone implements SmartDevice {}
class Laptop implements SmartDevice {}

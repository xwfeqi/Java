class One {
    private int number;

    One() {}
    One(int number) { this.number = number; }
    One(double number) { this.number = (int) number; }
    One(String number) { this.number = Integer.parseInt(number); }

    void method(int value) {
        System.out.println("Method in One with int: " + (number + value));
    }

    void method(double value) {
        System.out.println("Method in One with double: " + (number + value));
    }

    void uniqueMethod() {
        System.out.println("Unique method in One");
    }

    String printStr() {
        return "445343";
    }

    int getNumber() { return number; }
    void setNumber(int number) {
        this.number = number;
    }
}
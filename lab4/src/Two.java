class Two {
    private double decimal;

    Two(double decimal) { this.decimal = decimal; }

    void method(int value) {
        System.out.println("Method in Two with int: " + (decimal + value));
    }

    void method(double value) {
        System.out.println("Method in Two with double: " + (decimal + value));
    }

    void uniqueMethod() {
        System.out.println("Unique method in Two");
    }

    double getDecimal() { return decimal; }
    void setDecimal(double decimal) { this.decimal = decimal; }
}

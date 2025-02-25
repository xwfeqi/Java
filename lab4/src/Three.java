class Three {
    private String text;

    Three(String text) { this.text = text; }

    void method(int value) {
        System.out.println("Method in Three with int: " + text + value);
    }

    void method(double value) {
        System.out.println("Method in Three with double: " + text + value);
    }

    void uniqueMethod() {
        System.out.println("Unique method in Three");
    }

    String getText() { return text; }
    void setText(String text) { this.text = text; }
}

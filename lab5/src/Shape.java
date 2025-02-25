abstract class Shape {
    abstract double calculateArea();

    class Circle extends Shape {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    class Rectangle extends Shape {
        double width, height;
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        double calculateArea() {
            return width * height;
        }
    }
}

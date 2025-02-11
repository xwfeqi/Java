class Three {
    private double x;
    private double y;
    private double z;

    public Three(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void showCoordinates() {
        System.out.println("Three - x: " + x + ", y: " + y + ", z: " + z);
    }

    public double calculateProduct() {
        return x * y * z;
    }

    public void receiveObject(One obj) {
        System.out.println("Received object of One with sum: " + obj.calculateSum());
    }
}
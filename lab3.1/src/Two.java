class Two {
    private String name;
    private int age;
    private boolean status;

    public Two(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public void printDetails() {
        System.out.println("Two - Name: " + name + ", Age: " + age + ", Status: " + status);
    }

    public double ageInDecades() {
        return age / 10.0;
    }
}
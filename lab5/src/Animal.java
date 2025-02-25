public class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void makeSound()  {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}
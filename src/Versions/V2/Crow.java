package Versions.V2;

public class Crow extends Bird {
    public static void main(String[] args) {
        Bird b = new Crow();
        b.fly();
        b.eat();
        b.makeSound();
    }
    @Override
    void fly() {
        System.out.println("Because a crow can fly so this is how my crow will fly");
    }
    @Override
    void eat() {
        System.out.println("Because a crow can eat this is how my crow will eat");
    }

    @Override
    void makeSound() {
        System.out.println("Because a crow can make sound this how my crow makes sound");
    }
}

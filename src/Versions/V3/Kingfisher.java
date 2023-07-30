package Versions.V3;

public class Kingfisher extends Bird implements flyer{


    public static void main(String[] args) {
        Kingfisher k = new Kingfisher();
        k.makeSound();
        k.fly();
    }
    @Override
    void makeSound() {
        System.out.println("This is how a kingfisher makes sound");
    }

    @Override
    public void fly() {
        System.out.println("This is how a kingfisher flies");

    }
}

//// This is how Integration segregation principle works
/// Here rather than having a fat interface with too many methods , we are diving the interfaces for
/// their specific purpose and roles. Interfaces should be as light as possible.
/// interfaces should have those methods that logically belong together or are related to each other.

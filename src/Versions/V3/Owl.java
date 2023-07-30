package Versions.V3;

public class Owl extends Bird implements flyer,eater{
    public static void main(String[] args) {
        Owl o = new Owl();
        o.makeSound();
        o.fly();
        o.eat();

    }
    @Override
    void makeSound() {
        System.out.println("This is how an owl makes sound");

    }

    @Override
    public void eat() {
        System.out.println("This is how an owl eats");

    }

    @Override
    public void fly() {
        System.out.println("This is how an owl flies");

    }
}

package Versions.V3;

public class Penguin extends Bird implements eater{
    public static void main(String[] args) {
        eater e = new Penguin();
        e.eat();

    }

    @Override
    void makeSound() {
        System.out.println("This is how a Penguin makes Sound");
    }

    @Override
    public void eat() {
        System.out.println("This is how a Penguin eats");

    }
}

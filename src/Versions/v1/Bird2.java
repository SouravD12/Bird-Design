package Versions.v1;

public class Bird2 extends Bird {
    public static void main(String[] args) {
        Bird2 bird2 = new Bird2();
    }

    @Override
    void flyer() {
        System.out.println("This is how this bird flies");
    }

    @Override
    void eater() {
        System.out.println("This is how"+this.getName()+" "+this.getBreed()+"eats.");

    }

    @Override
    void makeSound() {

    }
}

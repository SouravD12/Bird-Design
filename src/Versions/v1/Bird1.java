package Versions.v1;

public class Bird1 extends Bird{
    public static void main(String[] args) {
        Bird1 bird1 = new Bird1();
        bird1.setName("Sourav");
        bird1.setBreed("Sparrow");
        bird1.flyer();

    }

    @Override
    void flyer() {
        System.out.println("This a how a"+" "+this.getName()+" "+this.getBreed()+" "+"flies.");
    }

    @Override
    void eater() {
        System.out.println("This is how a Sparrow eats.");

    }

    @Override
    void makeSound(){}
//        System.out.println("This is how a Sparrow makes Sound.");}
}

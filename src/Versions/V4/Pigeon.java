package Versions.V4;

public class Pigeon extends Bird implements FlyingBehaviour{

    public Pigeon(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Pigeon p = new Pigeon("Pigeon");
        p.fly();
    }

    @Override
    void makeSound() {
        System.out.println("This is how my bird will make Sound");
    }

    @Override
    public void fly() {
        FlyingBehaviour fb = new FastFlyingBehaviour();
        fb.fly();

    }


}

/// This is an example of dependency inversion principle.
/// Here pigeon class is loosely coupled with the Cute Flying behaviour via the "Flying Behaviour Interface".

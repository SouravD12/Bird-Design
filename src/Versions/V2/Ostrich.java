package Versions.V2;

public class Ostrich extends Bird {
    public static void main(String[] args) {
        Bird b = new Ostrich();
        b.fly();

    }

    @Override
    void fly() {
        System.out.println("An ostrich cannot fly , if we are using the fly method we will be violating LSP");
    }

    @Override
    void eat() {
        System.out.println("Because an ostrich can eat , this is how an ostrich will eat");

    }
}

/// Here we are giving a new definition to the child class . This violated LSP where the child class
/// should be doing exactly the same as parent class . When we are substituting the object of Bird class
/// with the object of ostrich class , it shouldn't be giving methods of the Bird class new definition.



/// You should inherit to do the same thing in different way but shouldn't inherit to do to different thing.
package Versions.DependencyInjection;

import Versions.V3.flyer;

public class Owl extends Bird  {
    FlyingBehaviour fb;
    public Owl(FlyingBehaviour fb){ // Dependency Injection
        this.fb = fb;
    }
    @Override
    void makeSound() {
    }

//    @Override
//    public void fly() {
//        System.out.println("Whoever implements this interface can fly");
//    }
    public void fly(){
        this.fb.fly(); // this ----> current owl object , fb -----> the dependency passed , .fly --> method of that dependency.
    }
}

//// Here we are injecting the dependency via the main class and through the constructor of owl class
//// Now the owl class is not at all dependent on an external class .
//// The dependency is given from the outside.
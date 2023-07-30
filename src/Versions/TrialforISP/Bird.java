package Versions.TrialforISP;

public class Bird implements EatingFlying{
    @Override
    public void eat() {

    }

    @Override
    public void doSomething() {

    }

    @Override
    public void fly() {

    }
}

/// The trial is here to show that an interface can extend other interfaces.
/// Eating flying is an interface that is extending eater and flyer
/// The class that implements EatingFLying needs to implement all the methods that are present in the EatingFlying
/// and also the other methods of the interfaces extended by EatingFlying.
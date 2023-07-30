package Versions.DependencyInjection;

public class FastFlyingBehaviour implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("This is a fast flying behaviour");
    }
}

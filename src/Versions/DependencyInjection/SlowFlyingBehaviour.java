package Versions.DependencyInjection;

public class SlowFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("This is a slow flying behaviour");

    }
}

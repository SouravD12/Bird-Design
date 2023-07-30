package Versions.V0;

public class childOfV0 extends V0 {
    public childOfV0(){};


    public static void main(String[] args) {
        childOfV0 child = new childOfV0();
        child.fly();

    }

    public void trip(){
        System.out.println("This is how i plan my trip");
    }
    void fly(){
        System.out.println("I want to fly whichever way i want");

    }
}

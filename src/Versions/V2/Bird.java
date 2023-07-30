package Versions.V2;

public class Bird {
    String name;
    int weight;
    String breed;
    void fly(){
        System.out.println("This can only be used by a child class who can fly");
    };
    void eat(){
        System.out.println("This can only be used by a child class who can eat");
    };
    void makeSound(){
        System.out.println("This can only be used by a child class who can make Sound.");
    };

}

package Versions.V0;

public class V0 {
    /// This is the 0th version of Bird
    /// Here we are making a bird class and that's it combining all its attributes and behaviours.
    private String name;
    private String breed;
    private int lifespan;
    private String originCountry;

    public static void main(String[] args) {
        V0 v = new V0();
        v.name = "Suman";
        v.breed = "Sparrow";
        v.fly();
        v.name = "Shubham";
        v.breed = "Crow";
        v.fly();
    }

    void fly(){
        System.out.println(name+' '+"is a"+' '+breed+" "+"that"+' '+"flies in this manner.");

        /// In this i can add if else or switch case conditions for different kinds of birds.
        /// this might cause merge conflicts , extensibility issues , regression etc.
        /// To many if else conditions are never good when implementing a design.
        /// Less code reuseability because now the methods are more tightly coupled.
    }
    void eat(){
        System.out.println("This is how a bird eats");
    }
    void makeSound(){
        System.out.println("This is how a bird makes Sound");
    }
}

/// DRY ------> Don't repeat yourself.

//// Violates SRP (Single Responsibility principle of SOLID.


/// SRP -----> Every code unit (Class, method , package etc.) must have exactly one responsibility (reason to change).


///SRP Violation :-
/// 1> Method with multiple if else (except when if else is part of business logic).
/// 2> Monster method is a code which does more than its name asks it to do.
/// 3> Commons/utils folders or files.(garbage place of everything)
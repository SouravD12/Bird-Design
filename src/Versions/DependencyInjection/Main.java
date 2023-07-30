package Versions.DependencyInjection;

import Versions.DependencyInjection.CuteFlyingBehaviour;
import Versions.DependencyInjection.Owl;

public class Main {
    public static void main(String[] args) {
        Owl o = new Owl(new CuteFlyingBehaviour());
        o.fly();
    }
}

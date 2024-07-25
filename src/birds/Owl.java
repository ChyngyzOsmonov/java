package birds;

import base_classes.Birds;
import interfaces.Flyable;

public class Owl extends Birds implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }

    @Override
    public void energyFrom() {
        System.out.println("Meat");
    }
}

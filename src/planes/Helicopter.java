package planes;

import base_classes.Aircrafts;
import interfaces.Flyable;

public class Helicopter extends Aircrafts implements Flyable {
    @Override
    public void fly() {
        System.out.println("helicopter");
    }

    @Override
    public void energyFrom() {
        System.out.println("oil");
    }
}

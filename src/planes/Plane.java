package planes;

import base_classes.Aircrafts;
import interfaces.Flyable;

public class Plane extends Aircrafts implements Flyable {

    @Override
    public void fly() {
        System.out.println("plane");
    }

    @Override
    public void energyFrom() {
        System.out.println("oil");
    }
}

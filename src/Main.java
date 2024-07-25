import base_classes.Aircrafts;
import birds.Eagle;
import birds.Owl;
import interfaces.Flyable;
import planes.Helicopter;
import planes.Plane;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Owl owl = new Owl();
        Helicopter helicopter = new Helicopter();
        Plane plane = new Plane();
        Flyable[] arr = {eagle, owl, helicopter, plane};
        callFly(arr);
    }

    public static void callFly(Flyable[] flyables) {
        Arrays.stream(flyables).toList().forEach( (i) -> {
            if (i instanceof Aircrafts) {
                i.fly();
            }
        });
    }
}
package generic;

import generic.base.Person;

import java.util.HashMap;
import java.util.List;

public class Theater<K,V extends Person> {
    HashMap<K, V[]> persons = new HashMap<>();

    public static void checkTickets() {

    }

    public void add(V[] row, K rowNum) {
        persons.put(rowNum, row);
    }
}

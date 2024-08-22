import generic.Critic;
import generic.Staff;
import generic.Visitor;
import generic.base.Person;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Person> persons = new HashMap<>();
        persons.put("visitor", new Visitor());
        persons.put("staff", new Staff());
        persons.put("critic", new Critic());
        seat(persons);
    }

    public static <T, E> void seat(HashMap<T, E> data) {
        data.forEach((key, value) -> {
            if (key instanceof String) {
                switch ((String) key) {
                    case ("visitor"):
                        System.out.println(value.toString());
                        break;
                    case ("staff"):
                        System.out.println(value.toString());
                        break;
                    case ("critic"):
                        System.out.println(value.toString());
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
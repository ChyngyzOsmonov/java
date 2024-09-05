import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Theater<K, V extends Person> {
    private Map<K, V[]> rows;
    private int rowCapacity;


    public Theater(int numRows, int rowCapacity) {
        this.rowCapacity = rowCapacity;
        this.rows = new HashMap<>();

        for (int i = 1; i <= numRows; i++) {
            rows.put((K) Integer.valueOf(i), (V[]) new Person[rowCapacity]);
        }
    }

    public boolean addPerson(K row, V person) {
        V[] persons = rows.get(row);
        for (int i = 0; i < rowCapacity; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                return true;
            }
        }
        System.out.println("Ряд " + row + " заполнен.");
        return false;
    }

    public boolean removePerson(K row, int index) {
        V[] persons = rows.get(row);

        if (index < 0 || index >= rowCapacity) {
            System.out.println("Некорректный индекс места.");
            return false;
        }

        if (persons[index] != null) {
            persons[index] = null;
            return true;
        } else {
            System.out.println("Место " + index + " в ряду " + row + " уже свободно.");
            return false;
        }
    }

    public void checkTickets() {
        for (Map.Entry<K, V[]> entry : rows.entrySet()) {
            K row = entry.getKey();
            V[] persons = entry.getValue();

            for (int i = 0; i < persons.length; i++) {
                if (persons[i] != null) {
                    System.out.println(persons[i] + " в ряду " + row + ", место " + i);
                }
            }
        }
    }
}

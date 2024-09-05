import java.util.List;

public class Client {
    private String id;
    private String name;
    private int age;
    private List<Phone> phones;

    public Client(String id, String name, int age, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public int getAge() {
        return age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public String getName() {
        return name;
    }
}

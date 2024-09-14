import java.util.Objects;
import java.util.UUID;

public class User {
    private String name;
    private UUID id;
    private String age;

    public User(String name, UUID id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getFullDetails() {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(id);
        stringBuilder.append(age);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(id, user.id) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                '}';
    }
}

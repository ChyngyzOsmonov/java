public class User {
    private int id;
    private String name;
    private String role;
    private String gender;
    private int age;

    public User(int id, String name, String role, String gender, int age) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name.substring(0, 5) + "\nAge: " + age;
    }
}

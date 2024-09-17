import java.util.UUID;

public class User {
    private UUID id;
    private String login;
    private int password;
    private String fName;
    private String lName;
    private String email;
    private String number;

    public User(UUID id, String login, int password, String fName, String lName, String email, String number) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.number = number;
    }


    public User(String login, int password) {
        this.id = UUID.randomUUID();
        this.login = login;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

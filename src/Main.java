import task1.HomeTask1;
import task2.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primitive values: byte, short, int, long, double, float, boolean, char
        User user = new User();
        HomeTask1 homeTask1 = new HomeTask1();
        user.setPassword(user.getPassword());

        System.out.println(homeTask1.validateCredentials("valid_login", "validPassword1", "validPassword1")); // true
        System.out.println(homeTask1.validateCredentials("invalid-login!", "validPassword1", "validPassword1")); // false
        System.out.println(homeTask1.validateCredentials("valid_login", "invalid_password!", "invalid_password!")); // false
        System.out.println(homeTask1.validateCredentials("valid_login", "validPassword1", "differentPassword")); // false
        System.out.println(homeTask1.validateCredentials("too_long_login_name_123", "validPassword1", "validPassword1")); // false
        System.out.println(homeTask1.validateCredentials("valid_login", "validPassword1", "validPassword1")); // true
    }
}
package task2;

import java.util.Scanner;

public class User {
    private String localLogin;
    private String password;
    private Scanner scn = new Scanner(System.in);

    public void setPassword(String login) {
        try {
            if (validateLogin(login)) {
                localLogin = login;
            }
        } catch (BadPasswordException e) {
            System.out.println("Enter new login");
            localLogin = scn.next();
            setPassword(localLogin);
        }
    }

    public String getPassword() {
        System.out.println("Enter new login");
        String tempLogin = scn.next();
        setPassword(tempLogin);
        return tempLogin;
    }

    private boolean validateLogin(String login) {
        if (login.matches("^.{8,20}$")) {
            return true;
        } else {
            throw new BadPasswordException();
        }
    }
}

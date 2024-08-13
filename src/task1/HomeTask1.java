package task1;

public class HomeTask1 {
    private static final String MY_REGEX = "^[A-Za-z0-9_]{1,20}$";
    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            // Проверка логина
            if (!login.matches(MY_REGEX)) {
                throw new WrongLoginException("Invalid login");
            }

            // Проверка пароля
            if (!password.matches(MY_REGEX)) {
                throw new WrongPasswordException("Invalid password");
            }

            // Проверка совпадения паролей
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match.");
            }

            // Если все проверки пройдены успешно
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

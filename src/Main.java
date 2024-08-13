//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HomeTaskRegex homeTaskRegex = new HomeTaskRegex();
        System.out.println(homeTaskRegex.isValidPhoneNumber("(123) 456-789-120"));
        System.out.println(homeTaskRegex.isValidPhoneNumber("123-45-7890"));

        System.out.println(homeTaskRegex.replaceFooWithBar("foobarfoo"));

        System.out.println(homeTaskRegex.isValidTime("23:59"));
        System.out.println(homeTaskRegex.isValidTime("12:60"));
        System.out.println(homeTaskRegex.isValidTime("24:00"));
    }
}
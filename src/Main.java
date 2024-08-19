//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat.sayMeaw2("aaa", String.class);
        Store<String, Integer> store = new Store<>("Test", 0);

        System.out.println(store);
    }
}
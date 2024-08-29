import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<User> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User(
                    random.nextInt(0, 100),
                    UUID.randomUUID().toString(),
                    i % 2 !=0 ? "free":"paid",
                    i % 2 !=0 ? "male":"female",
                    random.nextInt(15, 100)
            );
            arr.add(user);
        }

        long userCount = arr.stream().filter(n -> n.getRole().equals("free")).count();
        List userCollect = arr.stream().filter(n -> n.getRole().equals("free")).collect(Collectors.toList());
        System.out.println(userCount);

        arr.stream().filter(n -> n.getAge() + 10 >= 30).forEach(n->
            System.out.println(n+"\n")
        );
    }
}
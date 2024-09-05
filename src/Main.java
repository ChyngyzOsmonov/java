import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(10,1000));
        }

        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("hello");
        strings.add("java");

        filterNumberAbove500(numbers);
        filterOddNumber(numbers);
        setPalindromes(strings);
        getOldest();
    }

    private static void filterNumberAbove500(List<Integer> numbers) {
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 500)
                .toList();

        System.out.println("Числа выше 500: " + filteredNumbers);
    }

    private static void filterOddNumber(List<Integer> numbers){
        long oddCount = numbers.stream()
                .filter(n -> n % 2 != 0)
                .count();

        System.out.println("Количество нечетных чисел: " + oddCount);
    }

    private static void setPalindromes(List<String> strings) {
        List<String> palindromes = strings.stream()
                .map(s -> s + new StringBuilder(s).reverse().toString())
                .toList();

        System.out.println("Палиндромы: " + palindromes);
    }

    private static void getOldest() {
        List<Client> clients = new ArrayList<>();
        List<Phone> phones1 = new ArrayList<>();

        phones1.add(new Phone("123-456-789", "landline"));
        phones1.add(new Phone("987-654-321", "mobile"));
        clients.add(new Client("1", "John", 65, phones1));

        List<Phone> phones2 = new ArrayList<>();

        phones2.add(new Phone("555-666-777", "mobile"));
        clients.add(new Client("2", "Alice", 55, phones2));

        List<Phone> phones3 = new ArrayList<>();

        phones3.add(new Phone("111-222-333", "landline"));
        clients.add(new Client("3", "Bob", 70, phones3));

        Optional<Client> oldestClientWithLandline = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> "landline".equals(phone.getType())))
                .max((c1, c2) -> Integer.compare(c1.getAge(), c2.getAge()));

        if (oldestClientWithLandline.isPresent()) {
            Client client = oldestClientWithLandline.get();
            System.out.println("Самый возрастной клиент со стационарным телефоном: " + client.getName() + ", возраст: " + client.getAge());
        } else {
            System.out.println("Нет клиентов со стационарными телефонами.");
        }
    }
}
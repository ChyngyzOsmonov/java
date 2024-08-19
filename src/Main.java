import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Метод, который возвращает коллекцию без дубликатов
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 10, 11);
        Collection<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Уникальные числа: " + uniqueNumbers);

        // Задача 2: Заполнение ArrayList и LinkedList и выбор случайных элементов
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        addElements(arrayList);
        addElements(linkedList);

        System.out.println("ArrayList случайный выбор: " + measureRandomAccessTime(arrayList));
        System.out.println("LinkedList случайный выбор: " + measureRandomAccessTime(linkedList));

        // Задача 3: Замена второго элемента в ArrayList
        replaceSecondElement(arrayList, 42);
        System.out.println("ArrayList после замены второго элемента: " + arrayList);

        // Задача 4: Избавление от повторяющихся элементов в строке
        String input = "1, 2, 3, 4, 4, 5, 10,11";
        String result = removeDuplicatesFromString(input);
        System.out.println("Результат без дубликатов: " + result);

        // Задача 5: Операции объединения и пересечения множеств
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectSet = intersect(set1, set2);

        System.out.println("Объединение множеств: " + unionSet);
        System.out.println("Пересечение множеств: " + intersectSet);

        // Задача 6: Работа с HashMap и классом Book
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("Book1", new Book("Book1", 250, "Author1"));
        bookMap.put("Book2", new Book("Book2", 300, "Author2"));
        bookMap.put("Book3", new Book("Book3", 200, "Author3"));

        printEntrySet(bookMap);
        printKeySet(bookMap);
        printValues(bookMap);
    }

    // Метод 1: Удаление дубликатов из коллекции
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    // Метод 2: Добавление 1 миллиона элементов в список
    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    // Метод 2: Измерение времени выбора случайных элементов из списка
    public static long measureRandomAccessTime(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        }

        return System.nanoTime() - startTime;
    }

    // Метод 3: Замена второго элемента в ArrayList
    public static <T> void replaceSecondElement(List<T> list, T element) {
        if (list.size() > 1) {
            list.set(1, element);
        }
    }

    // Метод 4: Избавление от дубликатов в строке чисел
    public static String removeDuplicatesFromString(String input) {
        String[] numbers = input.split(",\\s*");
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));
        return String.join(", ", uniqueNumbers);
    }

    // Метод 5: Объединение множеств
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    // Метод 5: Пересечение множеств
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    // Метод 6: Печать entrySet
    public static void printEntrySet(Map<String, Book> bookMap) {
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    // Метод 6: Печать keySet
    public static void printKeySet(Map<String, Book> bookMap) {
        for (String key : bookMap.keySet()) {
            System.out.println("Ключ: " + key);
        }
    }

    // Метод 6: Печать values
    public static void printValues(Map<String, Book> bookMap) {
        for (Book book : bookMap.values()) {
            System.out.println("Значение: " + book);
        }
    }
}
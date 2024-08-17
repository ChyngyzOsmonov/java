import java.util.Arrays;

public class Main {
    public static Dog[] filterDogs(Animals[] animals) {
        return Arrays.stream(animals)
                .filter(animal -> animal instanceof Dog)
                .toArray(Dog[]::new);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Среднее арифметическое: " + HomeTask.calculateAverage(numbers));

        String[] strings = {"apple", "banana", "cherry"};
        System.out.println("Строки в обратном порядке:");
        HomeTask.printStringsInReverseOrder(strings);

        try {
            System.out.println("Строка по индексу 1: " + HomeTask.getStringByIndex(strings, 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        Animals[] animals = {new Cat(), new Dog(), new Cow(), new Dog()};

        Dog[] dogs = filterDogs(animals);
        System.out.println("Количество собак: " + dogs.length);
    }
}
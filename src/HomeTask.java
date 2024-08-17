public class HomeTask {
    // Метод для нахождения среднего арифметического значения массива целых чисел
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Метод для вывода массива строк в обратном порядке
    public static void printStringsInReverseOrder(String[] strings) {
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }

    // Метод для получения строки по индексу из массива строк
    public static String getStringByIndex(String[] strings, int index) throws IndexOutOfBoundsException {
        if (index >= strings.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива.");
        }
        return strings[index];
    }
}

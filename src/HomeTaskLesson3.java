import java.util.Scanner;

public class HomeTaskLesson3 {

    // 1. Возвести число A в степень B.
    public static long task1(Scanner scanner) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < B; i++) {
            result *= A;
        }
        return result;
    }

    // 2. Вывести все числа от 1 до 1000, которые делятся на A.
    public static void task2(Scanner scanner) {
        int A = scanner.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (i % A == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 3. Найдите количество положительных целых чисел, квадрат которых меньше A.
    public static int task3(Scanner scanner) {
        int A = scanner.nextInt();
        int count = 0;
        for (int i = 1; i * i < A; i++) {
            count++;
        }
        return count;
    }

    // 4. Вывести наибольший делитель (кроме самого A) числа A.
    public static int task4(Scanner scanner) {
        int A = scanner.nextInt();
        for (int i = A / 2; i > 0; i--) {
            if (A % i == 0) {
                return i;
            }
        }
        return 1; // если A - это 1, единственный делитель кроме A это 1
    }

    // 5. Вывести сумму всех чисел из диапазона от A до B, которые делятся без остатка на 7.
    public static int task5(Scanner scanner) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 6. Выведите N-ое число ряда Фибоначчи.
    public static int task6(Scanner scanner) {
        int N = scanner.nextInt();
        if (N <= 1) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 2; i < N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // 7. Найти наибольший общий делитель используя алгоритм Евклида.
    public static int task7(Scanner scanner) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    // 8. Найдите число N методом половинного деления.
    public static int task8(Scanner scanner) {
        int A = scanner.nextInt();
        int low = 0, high = A;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cube = mid * mid * mid;
            if (cube == A) {
                return mid;
            } else if (cube < A) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // 9. Найти количество нечетных цифр в числе.
    public static int task9(Scanner scanner) {
        int A = scanner.nextInt();
        int count = 0;
        while (A > 0) {
            if ((A % 10) % 2 != 0) {
                count++;
            }
            A /= 10;
        }
        return count;
    }

    // 10. Найти число, которое является зеркальным отображением последовательности цифр заданного числа.
    public static int task10(Scanner scanner) {
        int A = scanner.nextInt();
        int reversed = 0;
        while (A > 0) {
            reversed = reversed * 10 + A % 10;
            A /= 10;
        }
        return reversed;
    }

    // 11. Вывести числа в диапазоне от 1 до N, сумма четных цифр которых больше суммы нечетных.
    public static void task11(Scanner scanner) {
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            int evenSum = 0, oddSum = 0, num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                num /= 10;
            }
            if (evenSum > oddSum) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 12. Сообщите, есть ли в написании двух чисел одинаковые цифры.
    public static boolean task12(Scanner scanner) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean[] digits = new boolean[10];
        while (A > 0) {
            digits[A % 10] = true;
            A /= 10;
        }
        while (B > 0) {
            if (digits[B % 10]) {
                return true;
            }
            B /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(task1(scanner));
        task2(scanner);
        System.out.println(task3(scanner));
        System.out.println(task4(scanner));
        System.out.println(task5(scanner));
        System.out.println(task6(scanner));
        System.out.println(task7(scanner));
        System.out.println(task8(scanner));
        System.out.println(task9(scanner));
        System.out.println(task10(scanner));
        task11(scanner);
        System.out.println(task12(scanner));

        scanner.close();
    }
}
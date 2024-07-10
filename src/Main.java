//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive values: byte, short, int, long, double, float, boolean, char
        int firstTask = 5 + 2;
        float secondTask = 10f / 27f;
        int thirdTask = 228 / 87;
        long forthTask = 2390L * 1234124 * 3214;

        show(firstTask);
        show(secondTask);
        show(thirdTask);
        show(forthTask);

        Scanner scanner = new Scanner(System.in);
    }

    private static void show(Object data) {
        System.out.println(data);
    }

    private static void firstHT(Scanner scanner) {
        int data = scanner.nextInt();
        show(data + 1);
    }

    private static void secondHT(Scanner scanner) {
        long maxLongValue = 2147483647;
        show("Input more than "  + maxLongValue);
        BigInteger number = scanner.nextBigInteger();
        BigInteger bigIntegerValue = number.multiply(BigInteger.TWO);
        show(bigIntegerValue);
    }

    private static void thirdHT(Scanner scanner) {
        show("Input first value");
        String firstValue = scanner.next();
        show("Input second value");
        String secondValue = scanner.next();
        show(firstValue + secondValue);
    }

    private static void forthHT(Scanner scanner) {
        show("Input first number");
        int firstValue = scanner.nextInt();
        show("Input second number");
        int secondValue = scanner.nextInt();
        String result = String.valueOf(firstValue) + String.valueOf(secondValue);
        show(result);
    }

    private static void firstAdditional(Scanner scanner) {
        show("Input first number");
        int firstValue = scanner.nextInt();
        show("Input second number");
        int secondValue = scanner.nextInt();
        float resultOne = (float) firstValue / secondValue;
        int resultTwo = firstValue / secondValue;
        int resultThree = firstValue % secondValue;

        show("Result: " + resultOne);
        show("Result(/): " + resultTwo);
        show("Result(%): " + resultThree);
    }

    private static void secondAdditional(Scanner scanner) {
        show("Input first number");
        int firstValue = scanner.nextInt();
        show("Input second number");
        int secondValue = scanner.nextInt();
        float resultOne = (float) (5 * firstValue + secondValue) / (2 * firstValue - secondValue);

        show("Result: " + resultOne);
    }

    private static void thirdAdditional(Scanner scanner) {
        show("X");
        float x = scanner.nextFloat();
        show("Y");
        float y = scanner.nextFloat();
        double monthlyInterestRate = y / 100 / 12;
        double profitFirstMonth = x * monthlyInterestRate;
        show("Profit: " + profitFirstMonth);
    }

    private static void fourthAdditional(Scanner scanner) {
        show("a");
        float a = scanner.nextFloat();
        show("b");
        float b = scanner.nextFloat();
        show("c");
        float c = scanner.nextFloat();
        float result = (c-b)/a;
        show("Result: " + result);
    }

    private static void fifthAdditional(Scanner scanner) {
        show("a");
        String a = scanner.next();
        show("b");
        String b = scanner.next();

        show("a: " + a);
        show("b: " + b);
        show("Result after changing");
        String temp = a;
        a = b;
        b = temp;
        show("a: " + a);
        show("b: " + b);
    }
}
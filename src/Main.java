import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primitive values: byte, short, int, long, double, float, boolean, char
        Scanner console = new Scanner(System.in);
        int first = getNumber(console, "First number");
        int second = getNumber(console, "Second number");

        getResult(first, second);

        //task
        int firstValue = getNumber(console, "First number");
        int secondValue = getNumber(console, "Second number");

        if (firstValue > secondValue) {
            System.out.println(firstValue);
        } else {
            System.out.println(secondValue);
        }

        //task factorial
        int factNumber = getNumber(console, "Get number");
        System.out.println("Factorial of " + factNumber + " is " + calculateFactorial(factNumber));
    }

    private static int getNumber(Scanner scanner, String desc) {
        System.out.println(desc);
        return scanner.nextInt();
    }

    private static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    private static void getResult (int first, int second) {
        int result = first + second;
        System.out.println("Result: " + result);
    }
}
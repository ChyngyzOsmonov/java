import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatable calculatable = new Calculatable() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }

            @Override
            public int subtract(int a, int b) {
                return a / b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };

        int resultSum = calculatable.sum(scanner.nextInt(), scanner.nextInt());
        int resultSubtract = calculatable.subtract(scanner.nextInt(), scanner.nextInt());
        int resultMultiply = calculatable.multiply(scanner.nextInt(), scanner.nextInt());

        System.out.println(resultSum);
        System.out.println(resultSubtract);
        System.out.println(resultMultiply);

        powerableStatementLambda(scanner.nextInt(), scanner.nextInt());
    }

    private static void powerableStatementLambda(int num1, int num2) {
        Powerable powerable = (a, b) -> {
             var result = Math.pow(a, b);
            return (int)result;
        };
        System.out.println(powerable.power(num1, num2));
    }
}
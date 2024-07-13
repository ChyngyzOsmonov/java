import java.util.Scanner;

public class HomeTaskLesson2 {
    public int getNumber(Scanner scanner, String desc) {
        System.out.println(desc);
        return scanner.nextInt();
    }

    public void getResult (int first, int second) {
        int resultPlus = first + second;
        int resultMinus = first - second;
        int resultMultiple = first * second;
        int resultDivide = first / second;
        System.out.println("Result of plus: " + resultPlus);
        System.out.println("Result of minus: " + resultMinus);
        System.out.println("Result of multiple: " + resultMultiple);
        System.out.println("Result of divide: " + resultDivide);
    }

    public void getPhoneNumber(Scanner scanner, String desc) {
        System.out.println(desc);
        long phoneNumber = scanner.nextLong();

        long firstPart = phoneNumber / 1000000000;
        long secondPart = (phoneNumber / 1000000L) % 1000;
        long thirdPart = phoneNumber % 1000000L;

        System.out.println("Part 1 " + firstPart);
        System.out.println("Part 2 " + secondPart);
        System.out.println("Part 3 " + thirdPart);

        if (firstPart == 996) {
            System.out.println("KG phone number");
        } else {
            System.out.println("Not KG phone number");
        }

        if (secondPart < 10) {
            System.out.println("Incorrect format");
        } else {
            int formattedSecondPart = (int) secondPart / 10;

            if (formattedSecondPart == 50 || formattedSecondPart == 70) {
                System.out.println("O!");
            } else if (formattedSecondPart == 55 || formattedSecondPart == 75 || formattedSecondPart == 99) {
                System.out.println("Megacom");
            } else if (formattedSecondPart == 77) {
                System.out.println("Beeline");
            } else {
                System.out.println("Not KG operator");
            }
        }
    }
}

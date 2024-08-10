package homeTask3;

public class HomeTask3 {
    public void launch() {
        int start = 2;
        int end = 100;

        System.out.println("Простые числа в диапазоне от " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

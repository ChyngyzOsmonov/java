package homeTask4;

import homeTask2.HomeTask2;

import java.util.Random;

public class HomeTask4 {
    int[] array = new int[10001];
    Random rnd = new Random();

    public HomeTask4() {
        addRandomToArray();
    }

    private void addRandomToArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0, 200000);
        }
    }

    public boolean isExistInArray(int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}

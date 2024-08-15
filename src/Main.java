import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[20];

        for (int i = 0; i <array.length; i++) {
            array[i] = rnd.nextInt(1, 101);
        }

        System.out.println(Arrays.toString(getNumberByThreeDivided(array)));
    }

    public static int[] getNumberByThreeDivided(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j % 3 == 0) {
                count++;
            }
        }
        int[] tempArray = new int[count];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                tempArray[a] = array[i];
                a++;
            }
        }
        return tempArray;
    }
}
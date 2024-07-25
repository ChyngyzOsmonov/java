import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[300];
        Random rnd = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = rnd.nextInt(0, 260);
        }

        similarElement(arrayInt);
    }

    private static void similarElement(int[] arrayInt) {
        List<Integer> similar = new ArrayList<>();
        boolean[] visited = new boolean[arrayInt.length];

        for (int i = 0; i < arrayInt.length; i++) {
            if (!visited[i]) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] == arrayInt[j] && !visited[j]) {
                        similar.add(arrayInt[i]);
                        visited[j] = true;
                    }
                }
                visited[i] = true;
            }
        }

        System.out.println(String.valueOf(similar));
    }

    //create new class which have in constructor integer, methods: getIndexOfLastElement(), initArrayWithRandomInt(int sizeOfArray)
    //addIntToArrayWithCheckingLength()

}
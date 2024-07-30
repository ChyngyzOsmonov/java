import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] arrayInt = new int[300];
//        Random rnd = new Random();
//
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = rnd.nextInt(0, 260);
//        }
//
//        similarElement(arrayInt);

        ArrayHelper helper = new ArrayHelper(10);
        helper.generateWithRandom();
        System.out.println("Array: " + Arrays.toString(helper.getArray()));
        System.out.println("Sort by max: " + Arrays.toString(helper.sortByMax()));
        System.out.println("Sort by min: " + Arrays.toString(helper.sortByMin()));
        System.out.println("Index of max element: " + helper.geIndexOftMaxElement());
        System.out.println("Index of min element: " + helper.getIndexOfMinElement());
        System.out.println("Max element: " + helper.getMaxElement());
        System.out.println("Min element: " + helper.getMinElement());

        int min = helper.getArray()[0];
        int max = helper.getArray()[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < helper.getArray().length; i++) {
            if (min > helper.getArray()[i]) {
                min = helper.getArray()[i];
                minIndex = i;
            }

            if (max < helper.getArray()[i]) {
                max = helper.getArray()[i];
                maxIndex = i;
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(minIndex);
        System.out.println(maxIndex);

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
package homeTask2;

import java.util.*;

public class ArrayHelper {
    private int[] array;
    private int lastInitializedIndex;
    private int size;

    public ArrayHelper(int size) {
        array = new int[size];
        lastInitializedIndex = -1;
        this.size = size;
    }


    /**
     * Получение индекса последней инициализированной ячейки
     **/
    public int getLastInitializedIndex() {
        return lastInitializedIndex;
    }

    /**
     * Добавление элемента в массив.
     * В случае заполнения массива, старый массив должен быть заменен новым с сохранением значения
     **/
    public void addElement(int element) {
        if (lastInitializedIndex == array.length - 1) {
            array = createNewIfLimit(array.length * 2);
        }
        array[++lastInitializedIndex] = element;
    }

    /**
     * Заполнение массива заданным пользователем числом значений
     **/
    public void fillArray(int count, int value) {
        if (count > array.length) {
            array = createNewIfLimit(count);
        }
        for (int i = 0; i < count; i++) {
            array[i] = value;
        }
        lastInitializedIndex = count - 1;
    }

    public int[] getArray() {
        return array;
    }

    public int[] sortByMax() {
        return Arrays.stream(array).sorted().toArray();
    }

    public int[] sortByMin() {
        Arrays.sort(Arrays.stream(array).boxed().toArray(), Collections.reverseOrder());
        return array;
    }

    public int getMinElement() {
        return Arrays.stream(array).min().getAsInt();
    }

    public int getMaxElement() {
        return Arrays.stream(array).max().getAsInt();
    }

    public int getIndexOfMinElement() {
        int element = Arrays.stream(array).min().getAsInt();
        return getIndexByElement(element);
    }

    public int geIndexOftMaxElement() {
        int element = Arrays.stream(array).max().getAsInt();
        return getIndexByElement(element);
    }

    public int getIndexByElement(int element) {
        return Arrays.stream(array).boxed().toList().indexOf(element);
    }

    public int getArithmeticRange() {
        int calculated = 0;
        for (int i = 0; i < array.length; i++) {
            calculated+=i;
        }
        return calculated / array.length;
    }

    public void generateWithRandom() {
        int[] tempArray = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = rnd.nextInt(1, 260);
        }
        array = tempArray;
    }

    private int[] createNewIfLimit(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

}


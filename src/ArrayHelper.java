public class ArrayHelper {
    private int[] array;
    private int lastInitializedIndex;

    public ArrayHelper(int size) {
        array = new int[size];
        lastInitializedIndex = -1;
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

    private int[] createNewIfLimit(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

}

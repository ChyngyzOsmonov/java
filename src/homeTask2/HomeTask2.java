package homeTask2;

import java.util.Arrays;

public class HomeTask2 {
    ArrayHelper helper = new ArrayHelper(10);
    public void launchTask() {
        helper.generateWithRandom();
        System.out.println(helper.getMaxElement());
        System.out.println(helper.getMinElement());
        System.out.println(Arrays.toString(helper.sortByMin()));
        System.out.println(helper.getArithmeticRange());
    }
}

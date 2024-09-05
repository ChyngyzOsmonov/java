import compulsory.MyFunctionalInterface;
import compulsory.StringActions;
import compulsory.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Отсортированный список (с анонимным классом): " + list);

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Отсортированный список (с лямбда-выражением): " + list);

        MyFunctionalInterface addition = (a, b) -> a + b;
        int result = addition.sum(5, 3);
        System.out.println("Сумма: " + result);

        StringActions actions = new StringActions() {
            @Override
            public String concate(String s1, String s2) {
                return s1 + s2;
            }

            @Override
            public int countChars(String s) {
                return s.length();
            }

            @Override
            public char findChar(String s, int index) {
                return s.charAt(index);
            }
        };

        StringUtil util = new StringUtil(actions);

        System.out.println("Конкатенация: " + util.concatenate("Hello, ", "world!"));
        System.out.println("Количество символов: " + util.getCountChars("Hello"));
        System.out.println("Символ на позиции 1: " + util.getCharAt("Hello", 1));
    }
}
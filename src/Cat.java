public class Cat {
    public static <T> void sayMeaw(T data) {
        System.out.println("I eat " + data);
    }

    public static <T, E> void sayMeaw(T data, Class<E> clazz) {
        System.out.println("I eat " + data + "\n" + clazz);
    }

    public static <T, E, O> void sayMeaw2(T data, Class<E> clazz) {
        System.out.println("I eat " + data + "\n" + clazz);
    }
}

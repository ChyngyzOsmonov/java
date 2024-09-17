public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 0; i++) {
            Cat cat = new Cat();
            Thread thread = new Thread(cat);
            Thread.sleep(5000);
            thread.start();
        }
    }
}
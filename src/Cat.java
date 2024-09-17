public class Cat implements Runnable {
    private boolean doStop;

    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public void run() {
        int coonter = 0;
        while (!doStop) {
            System.out.println("Check");
            coonter++;
            if (coonter == 10) {
                stopThread();
            }
        }
    }

    private void stopThread() {
        doStop = true;
    }
}

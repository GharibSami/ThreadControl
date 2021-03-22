public class ThreadZ extends Thread {
    long start = 75000000, end = 100000000, result;

    @Override
    public void run() {
        for (int i = (int)start; i <= end; i++) {
            result+=i;
        }
    }
}

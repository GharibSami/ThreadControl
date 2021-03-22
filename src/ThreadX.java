public class ThreadX extends Thread {
    long start = 25000000, end = 50000000, result;

    @Override
    public void run() {
        for (int i = (int) start; i < end; i++) {
            result += i;
        }
    }
}

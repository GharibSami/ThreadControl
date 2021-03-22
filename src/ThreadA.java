public class ThreadA extends Thread{
    long start = 0, end = 25000000, result;

    @Override
    public void run() {
        for (int i = (int)start; i < end; i++) {
            result+=i;
        }
    }
}

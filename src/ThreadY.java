public class ThreadY extends Thread{
    long start = 50000000, end = 75000000, result;

    @Override
    public void run() {
        for (int i = (int)start; i < end; i++) {
            result+=i;
        }
    }
}

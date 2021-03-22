import java.util.concurrent.TimeUnit;

public class Main {

    public static void thread() throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadX threadX = new ThreadX();
        ThreadY threadY = new ThreadY();
        ThreadZ threadZ = new ThreadZ();

        long start = System.currentTimeMillis();
        threadA.start();
        threadX.start();
        threadY.start();
        threadZ.start();
        threadA.join();
        threadX.join();
        threadY.join();
        threadZ.join();
        System.out.println(threadX.result + threadY.result + threadZ.result + threadA.result);
        long End = System.currentTimeMillis();


        System.out.println("spended time is: " + (End - start) );
    }

    public static void sequential() {
        long start = System.currentTimeMillis();
        System.out.println(SequntialSum.sum());
        long End = System.currentTimeMillis();
        System.out.println("spended time is: " + (End - start) );
    }

    public static void main(String asgs[]) throws InterruptedException {

        thread();
        sequential();
    }
}

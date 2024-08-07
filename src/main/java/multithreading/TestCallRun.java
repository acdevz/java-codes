package multithreading;

public class TestCallRun extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestCallRun t1 = new TestCallRun();
        t1.start();
//        t1.join();
        System.out.println("Hello there!");
    }
}

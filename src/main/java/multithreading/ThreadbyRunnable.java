package multithreading;

public class ThreadbyRunnable {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread t = new Thread(new MyRunnable());
            t.start();
        }
    }
}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("MyRunnable " + Thread.currentThread().getName() + " running");
    }
}

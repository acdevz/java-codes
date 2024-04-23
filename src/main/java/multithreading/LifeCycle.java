package multithreading;

public class LifeCycle {
    public static void main(String[] args) {

    }
}

class thread implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread2 " + Thread.currentThread().getName() + " running");
    }
}

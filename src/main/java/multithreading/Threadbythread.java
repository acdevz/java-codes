package multithreading;

public class Threadbythread {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 8; i++){
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(3000);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread " + Thread.currentThread().getName() + " running");
    }
}

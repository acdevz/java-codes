package multithreading;

public class TestSynchronisation {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();
    }
}

class Table{
    int test = 0;
    synchronized void printTable(int n){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i + "\t..." + test);
                test++;
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(100);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(1000);
    }
}
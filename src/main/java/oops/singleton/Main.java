package oops.singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class MySingleton{
    private MySingleton(){ }
    private static MySingleton instance;

    public static MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }
}

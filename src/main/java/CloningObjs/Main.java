package CloningObjs;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aman = new Human(20, new int[]{1,2,3});
//        Human abdus = new Human(aman);
        Human abdus = (Human) aman.clone();
        abdus.dnaC[0] = 100;
        System.out.println(aman);
        System.out.println(abdus);
    }
}

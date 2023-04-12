package oops.properties.inheritence;

public class Main {
    public static void main(String[] args) {
//        IronBox iron = new IronBox();
//        IronBox iron = new IronBox(10, 20, 5, 7.874);
//        System.out.println(iron.density);

        /* we have access to variables and methods only of the reference type!  */
//        IronBox iron = new Box(10, 20, 5);
//        Box iron = new IronBox(10, 20, 5, 7.874); //calls super()
//        Box iron = new IronBox(); //calls default Box()


        IronBox box = new IronBox(2, 5, 1, 3.456);
        IronBox ironbox = new IronBox(box);
        System.out.println(ironbox.density);
        System.out.println(box.density);
    }
}

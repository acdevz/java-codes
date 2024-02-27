package Labs.week03;

public class P005 {
    public static void main(String[] args) {
        MyChild c = new MyChild();
        MyExtendedClass exc = new MyExtendedClass();

        /* errors */
//        MyExtendedClass exc2 = new MyExtendedClass(56);
//        MyExtendedClass exc3 = new MyExtendedClass(56.0);
//        MyClass mc = new MyClass(56.0, 78);
    }
}

class MyClass{
    protected int myVar;

    /* 0-argument constructor*/
    MyClass(){
        this.myVar = -1;
        System.out.println("MyClass Default Constructor Called.");
    }

    /* parameterised constructor*/
    MyClass(int value){
        this.myVar = value;
        System.out.println("MyClass Parameterised Constructor Called.");
    }

    /* constructor overloading */
    MyClass(double value){
        this.myVar = (int) value;
        System.out.println("MyClass Overloaded Constructor Called.");
    }
}

class MyExtendedClass extends MyClass{
    /* super calling */
    MyExtendedClass(){
        super();
        System.out.println("MyExtendedClass Constructor Called.");
    }
}

class MyParent{
    protected int id;
    MyParent(){
        System.out.println("MyParent Constructor Called.");
    }
}

class MyChild extends MyParent{
    MyChild(){
        this.id = -1;
        System.out.println("MyChild Constructor Called.");
    }
}


package oops.constructors;

public class Chaining {
    public static void main(String[] args) {
        Derived obj = new Derived(5);
    }
}

class Test{
    String name;

    Test(){
        this("default");
    }

    Test(String name){
        this.name = name;
    }
}

class Base{
    Base(){
        System.out.println("Base constructor");
    }
}

class Derived extends Base{

    // init block
    {
        System.out.println("Initialisation block");
    }

    Derived(){
//      NOTE: If we don't call super() explicitly, it will be called implicitly
        super();
        System.out.println("Derived constructor");
    }

    Derived(int x){
        this();
        System.out.println("Derived constructor with x");
    }
}

package oops.properties.polymorphism;

/* Types of polymorphism:
*  Compile time / static : method overloading (constructor overloading)
*  Run time / Dynamic : method overriding
*       Parent obj = new Child();
*       // which method is to be called depends on Child.
*       // thru, Dynamic method dispatch @runtime
*/

public class Shapes {
//    final void area(){ /* early (compile) binding : cannot override if overridden method is final. */
    void area(){ /* late (runtime) binding! */
        System.out.println("Area of a shape is specific to shape!");
    }
    static void info(){
        System.out.println("i'm a shape class.");
    }
}

/* Square */
class Square extends Shapes{
    @Override
    void area(){
        System.out.println("Area = side * side");
    }

    static void info(){
        System.out.println("i'm a square class.");
    }
}

/* Circle */
class Circle extends Shapes {
    @Override
    void area(){
        System.out.println("Area = PI * r * r");
    }
}

package oops.properties.inheritence;

//public final class Box { /* final cannot have inheritors! */
public class Box {
    double l;
    double b;
    double h;
    double density;

    /* should have a default constructor for the child */
    public Box(){
        /* super(); //every class inherits from Object class */
        this.l = 0;
        this.b = 0;
        this.h = 0;
        this.density = 1;
    }

    public Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public Box(Box other){
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
        this.density = other.density;
    }

    void print(){
        System.out.println("I am a box");
    }
}

class IronBox extends Box{
    double density;

    public IronBox(){
        this.density = 1;
    }

    public IronBox(IronBox other){
        super(other);
    }

    public IronBox(double l, double b, double h, double d) {
        /* super : calls the parent class constructor! */
        super(l, b, h);
        this.density = d;
    }

    void print(){
        System.out.println("I am an iron box");
    }
}

package oops.properties.inheritence;

public class Box {
    double l;
    double b;
    double h;

    public Box(){
        this.l = 0;
        this.b = 0;
        this.h = 0;
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
}

class IronBox extends Box{
    double density;

    public IronBox(){
        this.density = 0;
    }
    public IronBox(double l, double b, double h, double d) {
        /* super : calls the parent class constructor! */
        super(l, b, h);
        this.density = d;
    }
}

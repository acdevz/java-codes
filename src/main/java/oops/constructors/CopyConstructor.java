package oops.constructors;

public class CopyConstructor {
    public static void main(String[] args) {
        Complex cm1 = new Complex(2, 3);
        Complex cm2 = new Complex(cm1);

        System.out.println(cm1);
        System.out.println(cm2);
    }
}

class Complex{
    private double re;
    private double im;

    Complex(){
        this(0, 0);
    }

    Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    Complex(Complex cm){
        this(cm.re, cm.im);
    }

    public String toString(){
        return this.re + " + " + this.im + "i";
    }
}

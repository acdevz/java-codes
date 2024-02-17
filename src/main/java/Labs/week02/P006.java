package Labs.week02;

public class P006 {
    public static void main(String[] args) {
        double r = 5.0;
        double h = 10.0;
        int l = 5;
        int w = 10;

        System.out.println("Area of Circle: " + Area.getArea(r));
        System.out.println("Area of Cylinder: " + Area.getArea(r, h));
        System.out.println("Area of Rectangle: " + Area.getArea(l, w));
        
    }
}

class Area{
    public static double getArea(double r){
        return Math.PI * r * r;
    }

    public static double getArea(double r, double h){
        return Math.PI * r * r * h;
    }

    public static double getArea(int l, int w){
        return l * w;
    }
}

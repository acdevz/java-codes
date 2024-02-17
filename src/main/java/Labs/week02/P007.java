package Labs.week02;

import java.util.Scanner;

public class P007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Geometry Calculator");
        int choice = 0;
        while(choice != 4){
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    double r = in.nextDouble();
                    System.out.println("Area: " + Geometry.getCircleArea(r));
                    break;
                case 2:
                    System.out.println("Enter the length of the rectangle: ");
                    double l = in.nextDouble();
                    System.out.println("Enter the breadth of the rectangle: ");
                    double b = in.nextDouble();
                    System.out.println("Area: " + Geometry.getRectArea(l, b));
                    break;
                case 3:
                    System.out.println("Enter the base of the triangle: ");
                    double base = in.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = in.nextDouble();
                    System.out.println("Area: " + Geometry.getTriArea(base, height));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

class Geometry{
    public static double getCircleArea(double r){
        if(r < 0){
            System.out.println("Radius cannot be negative");
            return -1;
        }
        return Math.PI * r * r;
    }

    public static double getRectArea(double l, double b){
        if(l < 0 || b < 0){
            System.out.println("Length and Breadth cannot be negative");
            return -1;
        }
        return l * b;
    }

    public static double getTriArea(double b, double h){
        if(b < 0 || h < 0){
            System.out.println("Base and Height cannot be negative");
            return -1;
        }
        return 0.5 * b * h;
    }

}

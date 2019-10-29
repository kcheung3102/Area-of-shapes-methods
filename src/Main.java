import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        double base;
        double height;
        double length;
        double width;
        System.out.println("Circle, Triangle, Square or Rectangle?");
        userInput = input.nextLine().trim().toLowerCase();


        switch(userInput) {
            case "circle":
                System.out.println("Enter Radius of Circle");
                double r = input.nextDouble();

                AreaOfCircle(r);
                break;
            case "triangle":
                System.out.println("Enter Base of Triangle: ");
                base = input.nextDouble();

                System.out.println("Enter height of Triangle: ");
                height = input.nextDouble();

                AreaTriangle(height,base);
                break;
            case "rectangle":
                System.out.println("Enter length of rectangle: ");
                length = input.nextDouble();

                System.out.println("Enter width of rectangle: ");
                width = input.nextDouble();

                AreaRectangle(length,width);
                break;
            case "square":
                System.out.println("Enter length of a square");
                length = input.nextDouble();

                AreaSquare(length);
                break;
            default:
                System.out.println("Invalid Shape");
                break;
        }
    }

     private static void AreaOfCircle(double r) {
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Area of a circle: " + area);
    }

    private static void AreaTriangle(double height, double base) {
        double area = base*height/2;
        System.out.println("Area of Triangle is: " + area);
    }

    private static void AreaRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }

    private static void AreaSquare(double length) {
        double area = length * length;
        System.out.println("Area of Square is: " + area);
    }

}

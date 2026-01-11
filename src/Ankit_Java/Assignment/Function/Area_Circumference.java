package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class Area_Circumference {
    public static double Area(double radius){
        return Math.PI * (radius * radius);
    }

    public  static double Circumference(double radius){
        return 2 * (Math.PI * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius : ");
        double radius = sc.nextDouble();

        double Area = Area(radius);
        double Circumference = Circumference(radius);

        System.out.println("Area of circle = "+Area);
        System.out.print("Circumference of circle = "+Circumference);
        sc.close();
    }
}

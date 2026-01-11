package Ankit_Java.Assignment.Conditional_Loop;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = sc.nextFloat();
        double Area = 3.14 * radius * radius;

        System.out.println(Area);
        sc.close();
    }
}

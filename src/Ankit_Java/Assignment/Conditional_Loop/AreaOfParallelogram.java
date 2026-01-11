package Ankit_Java.Assignment.Conditional_Loop;
import java.util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double Area = base * height;
        System.out.println("Your Area is: "+Area);
        sc.close();
    }
}

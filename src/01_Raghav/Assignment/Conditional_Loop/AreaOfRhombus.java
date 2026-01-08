package Assignment.Conditional_Loop;
import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first diagonal: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the second diagonal: ");
        double d2 = sc.nextDouble();

        double Area = (d1 * d2) / 2;
        System.out.println("Your Rhombus is: "+Area);
        sc.close();
    }
}

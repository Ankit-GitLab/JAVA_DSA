package Assignment.Conditional_Loop;
import java.util.Scanner;
public class AreaOfTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        double base = sc.nextDouble();
        System.out.print("Enter height : ");
        double height = sc.nextDouble();

        Double Area = (1.0/2) * (base * height);
        System.out.println(Area);
        sc.close();
    }
}

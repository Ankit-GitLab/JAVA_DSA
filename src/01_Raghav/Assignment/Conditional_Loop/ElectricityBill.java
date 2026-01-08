package Assignment.Conditional_Loop;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the consumer how many unit consumed : ");
        float unit = sc.nextFloat();
        double rate = 7.50;

        double netAmount = unit * rate;

        System.out.print(netAmount);
        sc.close();

    }
}

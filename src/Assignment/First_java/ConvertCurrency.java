//Input currency in rupees and output in USD.
package Assignment.First_java;
import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees  : ");
        float Rupees = sc.nextFloat();
        double USD = Rupees * 0.0113441;
        System.out.println("Convert into USD : "+USD);
        sc.close();
    }
}

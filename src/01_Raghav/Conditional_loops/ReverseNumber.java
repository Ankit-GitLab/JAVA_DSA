package Conditional_loops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int Final = num;
        int Reverse = 0;
        while(num != 0){
            Reverse = Reverse * 10;
            Reverse = Reverse + (num % 10);
            num = num / 10;
        }
        System.out.println("Your number is ("+Final+") and reverse number is ("+Reverse+")");
    }
}

package Methods;
import java.security.PublicKey;
import java.util.Scanner;
public class SumOfTwoNumber {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number : ");
       int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
         int num2 = sc.nextInt();
         int Ans = num1 + num2;
         System.out.println(num1+" + "+num2+" = "+Ans);
    }

}

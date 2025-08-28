package Methods;
import java.security.PublicKey;
import java.util.Scanner;
public class SumOfTwoNumber {
    public static int Add(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();

        int Ans = Add(num1, num2);
        System.out.println(num1+" + "+num2+" = "+Ans);
    }
}

package Methods;

import java.util.Scanner;
import java.util.Scanner;
public class AddThroughReturn {
    public static void main(String[] args) {
       int Ans = sum();
        System.out.println(Ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();
        int Ans = num1 + num2;
        return Ans;

    }
}

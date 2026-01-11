package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class SumOfTwo {
    public static int Add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second : ");
        int num2 = sc.nextInt();
        
        int Ans = Add(num1, num2);
        System.out.println("The Sum of two number : "+Ans);
    }
}

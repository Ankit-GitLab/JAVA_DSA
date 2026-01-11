package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class MaxMin {
    public static void printMax(int a, int b, int c){
        int max;
        if(a>=b && a>=c){
            max = a;
        }else if(b>=a && b>=c){
            max = b;
        }else{
            max = c;
        }
        System.out.println("Your maximum number is : "+max);
    }
    public static void printMin(int a, int b, int c){
        int min;
        if(a<=b && a<=c){
            min = a;
        }else if(b<=a && b<=c){
            min = b;
        }else{
            min = c;
        }
        System.out.println("Your minimum number is : "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        printMax(num1, num2, num3);
        printMin(num1, num2, num3);

        sc.close();
    }
}

package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class SumOfNaturalNumber {

    public static int Natural(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int num = sc.nextInt();

        System.out.print("Sum of natural number is = "+Natural(num));
        sc.close();
    }
}

package Assignment.Function;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int product = 1;
       for(int i=1; i<=n; i++){
           product *= i;
       }
       return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for (int i = num; i>=0; i--){
            System.out.println(i+"! = "+fact(i));
        }
        sc.close();
    }
}

package Patterns;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        pattern1(num);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

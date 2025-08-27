package Conditional_loops;
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int i = 1;
        
        int count = 2;
        
        while(count <= n){
            int temp = i;
            i = i + a;
            a = temp;
            count++;
        }
        System.out.println(i);
    }
}

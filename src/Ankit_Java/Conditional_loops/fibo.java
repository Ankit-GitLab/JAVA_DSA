package Ankit_Java.Conditional_loops;
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int First = 0;
        int Second = 1;
        
        int count = 2;
        
        while(count <= n+1){
            System.out.print(First+" ");

            int temp = Second;
            Second = Second + First;
            First = temp;
            count++;
        }
        sc.close();
    }
}

package Conditional_loops;
import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper Case");
        }
    }
}

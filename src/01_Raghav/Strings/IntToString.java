package Strings;
import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number : ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        sc.close();
    }
}

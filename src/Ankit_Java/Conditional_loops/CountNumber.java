package Ankit_Java.Conditional_loops;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter one digit those you want to search : ");
        int search = sc.nextInt();

        int count = 0;
        while(num != 0){
            if(num % 10 == search){
                count++;
            }
            num = num/10;
        }
        System.out.println("Your ("+search+") number is present ("+count+") times");
    }
}

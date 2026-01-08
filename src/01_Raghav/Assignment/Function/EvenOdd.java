package Assignment.Function;
import java.util.Scanner;
public class EvenOdd {
    public static String evenOdd(int num){
        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String Ans = evenOdd(num);
        System.out.println("Your is --> "+Ans);
    }
}

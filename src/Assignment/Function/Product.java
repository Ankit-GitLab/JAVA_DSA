package Assignment.Function;
import java.util.Scanner;
public class Product {
    public static int Mutlipule(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second : ");
        int num2 = sc.nextInt();

        int Ans = Mutlipule(num1, num2);
        System.out.println("The Product of two number : "+Ans);
    }
}

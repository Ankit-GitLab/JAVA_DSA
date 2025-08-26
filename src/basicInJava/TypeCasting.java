package basicInJava;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter float number to convert integer number : ");
        float num = sc.nextFloat();
        System.out.println(num);

        //Type Casting
        int num1 = (int)  (67.56f);
        System.out.println("Type Casting : "+num1);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);
    }
}

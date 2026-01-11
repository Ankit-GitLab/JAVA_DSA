package Ankit_Java.First_Program;
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
        int num2 = 257;
        byte num3 = (byte)(num2);
        System.out.println(num3);

        byte num4 = 40;
        byte num5 = 50;
        byte num6 = 100;
        int Ans = (num4 * num5) / num6;
        System.out.println("byte convert into integer : "+Ans);

        int num7 = 'A';
        System.out.println("Character Automatic convert into the integer : "+num7);
    }
}

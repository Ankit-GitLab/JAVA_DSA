package Ankit_Java.First_Program;
import java .util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your roll number : ");
        int rollNo = sc.nextInt();
        System.out.println("Please enter your name : ");
        String name = sc.next();
        System.out.println("Please enter your mark : ");
        float marks = sc.nextFloat();
        System.out.println("Your roll number is : "+rollNo);
        System.out.println("your name is : "+name);
        System.out.println(name+" your mark is : "+marks);
    }
}

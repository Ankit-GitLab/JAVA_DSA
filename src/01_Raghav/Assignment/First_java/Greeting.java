//Take name as input and print a greeting message for that particular name.
package Assignment.First_java;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please your name : ");
        String name = sc.nextLine();
        System.out.println("Welcome "+name+" to my java program!");
        sc.close();
    }
}

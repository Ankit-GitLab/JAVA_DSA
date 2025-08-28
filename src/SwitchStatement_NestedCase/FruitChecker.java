package SwitchStatement_NestedCase;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FruitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit name : ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit ");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }
        sc.close();
    }
}

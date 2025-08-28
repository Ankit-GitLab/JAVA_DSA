package SwitchStatement_NestedCase;
import java.util.Scanner;
public class WeekDay_WeekEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
            default:
                System.out.println("Weekends");
                break;
        }
        sc.close();
    }
}

package Ankit_Java.SwitchStatement_NestedCase;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empID number : ");
        int empID = sc.nextInt();
        System.out.print("Enter department name : ");
        String department = sc.next();

        switch (empID){
            case 1:
                System.out.println("Ankit Kumar");
                break;
            case 2:
                System.out.print("Ravi Raj");
                break;
            case 3:
                System.out.println("Vishal, vedant");

                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}

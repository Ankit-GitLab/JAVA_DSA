package Assignment.Function;
import java.util.Scanner;
public class VotingAge {
    public static String voter(int age){
        if (age >= 18) {
           return "You are eligible for vote.";
        }
        else {
            return "You are not eligible for vote.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to check the voter or not : ");
        int age = sc.nextInt();

        String Ans = voter(age);
        System.out.println(Ans);

        sc.close();
    }
}

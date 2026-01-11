package Ankit_Java.Assignment.Function;
import java.util.Scanner;
public class PrimeOrNot {

    public static boolean isPrime(double n){
        if(n <= 1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = sc.nextDouble();

        if(isPrime(num)){
            System.out.println((int)num+" is prime ");
        }else{
            System.out.print((int)num+" is not prime");
        }
        sc.close();
    }
}

package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that take in a number and prints it
        // print first 5 number : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(n);
            return;
        }
        //recursive call
        // if you are calling a function again and again, you can treat it as a separate in the stack
        System.out.print(n+" ");
        print(n + 1);

    }
}

package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that take in a number and prints it
        // print first 5 number : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n==5) return;
        System.out.print(n+" ");
        print(n + 1);

    }
}

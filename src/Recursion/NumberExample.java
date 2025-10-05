package Recursion;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that take in a number and prints it
        // print first 5 number : 1 2 3 4 5
        print1(1);
    }
    static void print1(int n){
        System.out.print(n+" ");
        print2(2);
    }
    static void print2(int n){
        System.out.print(n+" ");
        print3(3);
    }
    static void print3(int n){
        System.out.print(n+" ");
        print4(4);
    }
    static void print4(int n){
        System.out.print(n+" ");

        print5(5);

    }
    static void print5(int n){
        System.out.print(n+" ");

    }
}

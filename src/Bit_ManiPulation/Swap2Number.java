package Bit_ManiPulation;

public class Swap2Number {
    public static void main(String[] args) {
        int a=2, b=5;
        System.out.println(a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);
    }
}

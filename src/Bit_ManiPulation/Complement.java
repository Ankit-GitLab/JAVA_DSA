package Bit_ManiPulation;

public class Complement {
    public static void main(String[] args) {
        int a=5;

        System.out.println(~a); // 1's complement
        System.out.println(-a-1); // 1's complement
        System.out.println(~a+1); // 2's complement
        System.out.println(-a); // 2's complement
    }
}

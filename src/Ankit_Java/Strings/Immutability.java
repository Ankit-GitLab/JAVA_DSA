package Ankit_Java.Strings;

public class Immutability {
    public static void main(String[] args) {
        String s = "Ankit";
        s = s.substring(0,1) +'m'+s.substring(3);
        System.out.println(s);
    }
}

package Strings.StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        String s = "Ankit";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

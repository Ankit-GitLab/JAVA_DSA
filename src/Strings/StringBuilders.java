package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Ankit");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append("Kumar");
        System.out.println(s);
        s.setCharAt(1,'m');
        System.out.println(s);
    }
}

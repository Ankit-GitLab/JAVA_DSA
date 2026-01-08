package Strings;

public class ChangeTheString {
    public static String toLowerCase(String a){
        return a.toLowerCase();
    }

    public static String toUpperCase(String a){
        return a.toUpperCase();
    }

    public static void main(String[] args) {
        String sc = "AnKiT KuMaR";
        System.out.println(sc);
        String lower = toLowerCase(sc);
        System.out.println(lower);
        String upper = toUpperCase(sc);
        System.out.println(upper);

    }
}

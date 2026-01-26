package Strings;

public class CompareToString {
    public static int compareTo(String a, String b){
        return b.compareTo(a);
    }

    public static void main(String[] args) {
        String a = "Ankit";
        String b = "Ankita";
        System.out.println(compareTo(a,b));

    }
}

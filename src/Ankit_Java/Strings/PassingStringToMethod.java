package Ankit_Java.Strings;

public class PassingStringToMethod {
    public static void change(String x){
        x = "KUMAR";
    }

    public static void main(String[] args) {
        String s = "Ankit";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}

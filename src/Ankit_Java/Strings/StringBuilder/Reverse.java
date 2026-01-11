package Ankit_Java.Strings.StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        String s = "Ankit";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        int i=0, j = sb.length()-1;

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(1,"n");
        System.out.println(sb);

        sb.delete(3,5); // -----> (3 to 4) delete only
        System.out.println(sb);


    }
}

package Ankit_Java.Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
        str[0] ="Ankit kumar";
        System.out.println(Arrays.toString(str));
    }
}

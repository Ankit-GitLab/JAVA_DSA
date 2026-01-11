package Ankit_Java.Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class InputInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int num : arr) {
            System.out.print(num+ " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr)+" ");
        sc.close();
    }
}

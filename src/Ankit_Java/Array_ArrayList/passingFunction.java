package Ankit_Java.Array_ArrayList;

import java.util.Arrays;

public class passingFunction {
    public static void main(String[] args) {
        int[] num =  {2, 3, 5, 7, 8};
        System.out.println(Arrays.toString(num)+" ");
        change(num);
        System.out.println(Arrays.toString(num)+" ");
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

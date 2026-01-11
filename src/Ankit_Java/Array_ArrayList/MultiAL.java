package Ankit_Java.Array_ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        sc.close();
    }

    public static class Max {
        public static void main(String[] args) {
            int[] arr = {1,90,3,4,5,6};
            int max = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }

    }
}

package Recursion.Array;

import java.util.ArrayList;

public class returnTheList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7,9};
        int target = 5;
        ArrayList<Integer> ans = findAllIndex(arr,4,0);
        System.out.println(ans);

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>() ;
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);
        list.addAll(ansFromBelowCalls );
        return list;
    }
}

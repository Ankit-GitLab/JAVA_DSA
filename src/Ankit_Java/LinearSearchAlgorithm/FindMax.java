package Ankit_Java.LinearSearchAlgorithm;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {23, 45, 46, 12, 78, 98, 56};
        System.out.println("your max element is : "+max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

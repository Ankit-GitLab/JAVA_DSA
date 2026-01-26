package BinarySearch;

public class LeetCode_2529 {
    public static int maximumCount(int[] arr){
        int pos = 0, neg = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
    public static void main(String[] args) {
        int[] arr = {-1,3,90,-9,9,4,3,-1,-7};
        System.out.println(maximumCount(arr));
    }
}

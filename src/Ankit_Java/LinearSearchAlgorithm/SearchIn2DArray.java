package Ankit_Java.LinearSearchAlgorithm;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {13, 35, 78, 43},
                {23, 56, 24, 94},
                {18, 22}
        };
        int target = 35;
        System.out.println("Find the target array is : "+search(arr, target));


    }
    static int search(int[][] arr, int  target){
        int ans = arr[0][0];
        for(int row = 0; row<arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }


}

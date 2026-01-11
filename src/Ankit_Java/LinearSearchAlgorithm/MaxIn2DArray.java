package Ankit_Java.LinearSearchAlgorithm;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {13, 35, 78, 43},
                {23, 56, 24, 94},
                {18, 22}
        };

        System.out.println("Find the maximum element in the array is : "+max(arr));

    }

    // maximum number
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}

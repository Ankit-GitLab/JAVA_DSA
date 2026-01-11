package Ankit_Java.LinearSearchAlgorithm;

public class MinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {13, 35, 78, 43},
                {23, 56, 24, 94},
                {18, 22}
        };

        System.out.println("Find the minimum element in the array is : "+min(arr));

    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }
}

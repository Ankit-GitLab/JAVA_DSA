package Assignment.Arrays;

import java.util.Arrays; // for printing array

public class BuildArrayFromPermutation {

    // Function takes int[] nums as input and returns int[] ans


    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println();
        int[] ans = buildArrays(arr); // fixed here

        // Print result
        System.out.println("Result: " + Arrays.toString(ans));
    }
}

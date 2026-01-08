package Basic_Sorting.Selection;
import java.util.Scanner;

public class PairWithGivenSum {

    // Function to print array
    public static void print(int[] arr) {
        SelectionSort.printSelection(arr);
    }

    // Function to check if pair exists with given sum
    public static boolean twoSum(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) return true;
            else if (sum > target) j--;  // decrease larger side
            else i++;                    // increase smaller side
        }
        return false;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to find a pair of two numbers : ");
        int target = sc.nextInt();

        int[] arr = {1, 23, 45, 9, 7, 5};

        System.out.print("Original array: ");
        print(arr);

        System.out.print("Sorted array: ");
        int[] Ans = SelectionSort.sort(arr);
        print(Ans);

        boolean pair = twoSum(Ans, target);
        System.out.println("Pair exists with sum " + target + " --> " + pair);

        sc.close();
    }
}

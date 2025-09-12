package Basic_Sorting;

public class DescendingOrder {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 52, 34, 78, 14};
        int n = arr.length;
        print(arr);

        // Corrected bubble sort for descending order
        for(int i = 0; i < n - 1; i++) {
            int swap = 0;
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) { // Swap if current element is smaller than next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break; // If no swaps occurred, array is already sorted
        }

        print(arr);
    }
}
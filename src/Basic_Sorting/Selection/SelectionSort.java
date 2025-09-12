package Basic_Sorting.Selection;

public class SelectionSort {
    public static void printSelection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mIndex = j;
                }
            }
            //Swap
            int temp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = temp;

        }
        printSelection(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, -1, 45, 23, 21, 0};
        printSelection(arr);
        int[] Ans = sort(arr);
        printSelection(Ans);
    }
}

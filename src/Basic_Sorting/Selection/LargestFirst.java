package Basic_Sorting.Selection;

public class LargestFirst {
    public static void printSelection(int[] arr){
        SelectionSort.printSelection(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, -1, 45, 23, 29, 21, 0};
        int n = arr.length;
        printSelection(arr);

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int mIndex = arr[0];
            for(int j=i; j<n; j++){
                if(arr[j]>max){
                    max = arr[j];
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
}

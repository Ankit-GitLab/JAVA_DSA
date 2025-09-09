package Basic_Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted==true) break;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}

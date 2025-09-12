package Basic_Sorting;

public class MoveAllZeroToEnd {
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 12, 34, 1, 0, 45, 12, 0};
        int n = arr.length;
        print(arr);

        // move all zero to end?
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //output
        print(arr);
    }
}

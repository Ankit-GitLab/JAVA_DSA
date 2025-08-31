package LinearSearchAlgorithm;

public class main {
    public static void main(String[] args) {
        int[] num = {23, 45, 46, 12, 78, 98, 56};
        int target = 22;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index=0; index<arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}

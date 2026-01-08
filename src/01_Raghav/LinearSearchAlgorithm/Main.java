package LinearSearchAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[] num = {23, 45, 46, 12, 78, 98, 56};
        int target = 12;
        int ans = linearSearch(num, target);
        System.out.println(ans);
        boolean ans2 = findElement(num, target);
        System.out.println(ans2);
    }

    // true or false
    static boolean findElement(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return false;
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

package Recursion.Sort.Bubble;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 5, 4, 8, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

            // if you did not swap for a particular value of i, it means the arrays is sorted hence stop the program
            if(!swapped){ // ---> swapped == false
                break;
            }
        }
    }
}

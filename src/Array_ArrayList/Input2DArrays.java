package Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Input2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter2D Arrays (3, 2)");
        int[][] arr2D = new int[3][2];
        // For Input
        for(int row=0; row<arr2D.length; row++ ){
            for(int column=0; column<arr2D[row].length; column++){
                arr2D[row][column] = sc.nextInt();
            }
        }
        // For output
        for(int row=0; row<arr2D.length; row++ ){
            for(int column=0; column<arr2D[row].length; column++){
                System.out.print( arr2D[row][column]+" ");
            }
            System.out.println();
        }
        //  to string use to print output
        System.out.println("Method two!");
        for(int row =0; row<arr2D.length; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }
    }
}

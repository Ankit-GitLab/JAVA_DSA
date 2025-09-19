package BinarySearch;
import java.util.Scanner;
public class SquareRootInFloor {
    public static int floorRoot(int num){
        int root = 0;
        for(int i=0; i<=num; i++){
            if(i*i > num) {
                root = i;
                break;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(floorRoot(num));
    }
}

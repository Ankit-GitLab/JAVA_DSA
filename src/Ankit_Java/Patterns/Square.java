package Ankit_Java.Patterns;

public class Square {
    public static void main(String[] args) {
        int num = 4;
        pattern2(num);
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

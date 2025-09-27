package Patterns;

public class Tringle2 {
    public static void main(String[] args) {
        int num = 4;
        pattern3(num);
    }
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n+1-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

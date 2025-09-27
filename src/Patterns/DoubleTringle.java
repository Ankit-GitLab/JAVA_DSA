package Patterns;

public class DoubleTringle {
    public static void main(String[] args) {
        parttern5(5);
    }
    static void parttern5(int n){
        for(int row=1; row<=n; row++){
                for(int col=1; col<=row; col++){
                    System.out.print("* ");
                }
                System.out.println();
        }

        // lower
        for(int row=1; row<n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

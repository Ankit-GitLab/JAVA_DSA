package Patterns;

public class Square {
    public static void main(String[] args) {
        int num = 4;
        pattern2(num);
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

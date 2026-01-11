package Ankit_Java.Patterns;

public class DoubleTringle {
    public static void main(String[] args) {
        parttern5(5);   // first style
        patterns1(5);   // second style
    }

    // First method (upper + lower triangles)
    static void parttern5(int n) {
        // upper triangle
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower triangle
        for(int row = 1; row < n; row++) {
            for(int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Second method (using formula)
    static void patterns1(int n) {
        for(int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            for(int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

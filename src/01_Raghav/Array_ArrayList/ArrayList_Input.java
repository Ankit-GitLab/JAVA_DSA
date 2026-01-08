package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList for integers

        System.out.println("Enter 5 integers:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter value for index " + i + ": ");
            list.add(sc.nextInt()); // Add integer directly
        }

        // Print the list
        System.out.println("\nYour list: " + list);

        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        sc.close();
    }
}
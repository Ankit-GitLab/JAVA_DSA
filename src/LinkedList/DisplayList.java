package LinkedList;
import java.util.Scanner;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class DisplayList {
    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);

    }

    public static void display(Node head) {
        //using while loop
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        ////         using for loop
//        for(Node temp = head; temp != null; temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt()); // head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        e.next = f;
//        display(a);
        displayRec(a);
    }
 }

package LinkedList;
import java.util.Scanner;


public class DisplayList {
    void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);

    }

    void display(Node head) {
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

        Node a = new Node(10); // head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        e.next = f;
//        display(a);
//        displayRec(a);
        System.out.println(get(a,4));
    }
    private static int get(Node head, int idx){
        Node temp = head;
        for(int i = 1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
 }

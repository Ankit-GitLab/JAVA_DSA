package LinkedList;
class Node{
    int val;
    Node next;
}
public class NodeOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(); a.val = 10;
        Node b = new Node(); a.val = 20;
        Node c = new Node(); a.val = 30;
        Node d = new Node(); a.val = 40;
        Node e = new Node(); a.val = 50;
        // connected with each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
    }
}

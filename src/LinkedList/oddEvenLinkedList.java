package LinkedList;

public class oddEvenLinkedList {
    public Node oddEven(Node head) {
        Node odd = new Node(-1);
        Node even = new Node(-1);
        Node t1 = odd;
        Node t2 = even;
        Node t = head;
        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t!=null) t = t.next;
            t2 = t2.next;
        }
        t1.next = even.next;
        return odd.next;
    }

    public static void main(String[] args) {

    }
}

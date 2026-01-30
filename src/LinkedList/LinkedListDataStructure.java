package LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size;

    int get(int idx){
        Node temp = head;
        for(int i = 1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) addAtHead(val);
        else if(idx == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i=0; i<=idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }

    }
    int search(int val){
        if(head == null) return -1;
        int idx = 0;
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void addAtTail(int val){

        if(tail == null){
            addAtHead(val);
            return;
        } else {
            Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
            size++;
        }

    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;

    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40); ll.display();
        ll.addAtHead(50); ll.display();
        ll.deleteAtHead(); ll.display();
        System.out.println("size of linked list : "+ll.size);
        System.out.println(ll.search(30));
        ll.insert(40,1); ll.display();
        System.out.println(ll.get(3));
    }
}

package LinkedList;

import java.awt.*;

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

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = null;
        }else{
            temp.next = head;
            head = temp;
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
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println("size of linked list : "+ll.size);
    }
}

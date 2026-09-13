import java.util.*;
public class doubleLL{

    public class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     //print link list
     public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
     }
    //add first in doble ll 
/*
Question: How do prev and next pointers change in a doubly linked list during insert and delete?
Example: 1 <-> 2 <-> 3 can be linked forward and backward.
*/
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail=newNode;
            return;
        }
       newNode.next = head;
       head.prev = newNode;
       head = newNode;
       
    }
    //add at last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    //remove from the first
    public int firstremove(){
        if(head == null){
          System.out.println("double link list is empty");
          return Integer.MIN_VALUE;
        }

        int val = head.data;
        head =  head.next;
        head.prev =  null;
        size--;
        return val;
    }
//count size
public static int countSize(){
    Node temp = head;
    int count =0;
    while(temp != null){
        temp = temp.next;
        count++;
    }
    return count;
}
    //rremove from last
    public int removeLast(){
        if(head == null){
            System.out.println("empty link list");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
             int val = head.data;
             head = null;
             return val;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;

    }
    public void reverce(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
          next = curr.next;
          curr.next = prev;
          curr.prev = next;
          prev = curr;
          curr = next;
        }
        head = prev;
    }
    
    public static void main(String args[]){
     doubleLL dll = new doubleLL();
     dll.addFirst(1);
     dll.addFirst(2);
     dll.addFirst(3);
     print();
     dll.addLast(5);
     print();
     dll.firstremove();
     print();
     dll.removeLast();
     print();
     dll.addFirst(3);
     dll.addFirst(4);
     print();
     dll.reverce();
     print();


    }
}
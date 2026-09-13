package LinkList;

import java.util.*;

public class creatLL {
    public static class node {
    int data;
    node next;

    public node(int data){
        this.data = data;
        this.next = null;
    }     
    }
    public static node head;
    public static node tail;
    public static int size;

    //method
    //add()
/*
Question: How do you insert, delete, search, reverse, and remove the nth node in a singly linked list?
Example: Start with 1 -> 2 -> 3, then reverse to 3 -> 2 -> 1.
*/
    public void addFirst(int data){
       ///step1 create new node
       node newNode = new node(data);
       size++;

       if(head == null){
        head = tail = newNode;
        return;
       }

       //step 2 newnode next = head
       newNode.next = head; // link
       //step3 
       head = newNode;
    }

    //ad at last
    public void addLast(int data){
        node newNode = new node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next =newNode;
        tail = newNode;
    }

    //add in middlle
    public void add(int idx,int data){
        node newNode = new node(data);
        if(idx == 0){
            addFirst(data);
            return;
        }
        size++;

        node temp = head;
        int i=0;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
         newNode.next = temp.next;
         temp.next = newNode;

    }
//remove first
public int removeFirst(){
    if(size==0){
        System.out.println("linked list is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head= tail=null;
        size =0;
        return val;
    }
    int val =head.data;
    head = head.next;
    size--;
    return val;
}
//count size
public
//remove from the last
public int removeLast1(){
    if(size == 0){
        System.out.println("link list dosen't exist");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null ;
        size=0;
        return val;
    }
    //now for more the 1 node loop will go till size-2 cuz we need the previous of tail
    node prev = head;
    for(int i=0;i<size-2;i++){
        prev = prev.next;
    }
    int val = prev.next.data;//tail data
    prev.next = null;
    size--;
    return val;
}
//iterative search
public int search(int key){
    node temp = head;
    int i=0;
    while(temp != null){
        if(temp.data == key){
            return i;
        }
       temp = temp.next;
        i++;
    }
    return -1;
}

//search by recusion
public int helper(node head,int key){
          if(head == null){
            return -1;
          }
          if(head.data == key){
            return 0;
          }
          int idx = helper(head.next, key);
          if(idx == -1){
            return -1;
          }
          return idx+1;
}
public int recursiveSerach(int key){
          return helper(head, key);
}

//reverse the ll
public void reverseLL(){
    node prev = null;
    node curr  =tail= head;
    node next;
    while(curr != null){
       next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
    }
    head = prev;
}
//remove from nth position 
public void removeNth(int n){
    //calculate size
    int sz =0;
    node temp = head;
    while (temp != null) {
        temp = temp.next;
        sz++;
    }

    //edge case
    if( n == sz ){
        head = head.next;
        return;
    }

    //run to size-n which will be prev of curr which need to remove
    int i=1;
    node prev = head;
    int stop = sz-n;
    while(i<stop){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;

}
    //print linked list
    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
          node temp = head;
          while (temp !=  null) {
            System.out.print(temp.data+" --> ");
            temp =  temp.next;
          }
          System.out.println("null");
    }
    
    public static void main(String[] args) {
        creatLL ll = new creatLL();
       //method
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(3); 
       ll.addLast(4);
       ll.add(2, 9);
       ll.print();
       System.out.println(ll.size);
       ll.removeFirst();
       ll.print();
       System.out.println("after remove first size :"+ll.size);
       ll.removeLast();
       ll.print();

       System.err.println(ll.search(3));
       System.out.println(ll.search(22));
       System.out.println("search by recursion");
       System.out.println(ll.recursiveSerach(3));
       System.out.println("reverse:");
       ll.print();
       ll.reverseLL();
       ll.print();
       ll.removeNth(1);
       ll.print();

       
       
    }
}

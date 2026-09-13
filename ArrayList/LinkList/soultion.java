import java.util.*;

public class soultion{

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    Node oghead;

    public void swap(int x, int y){
         if(x == y){
            return;
         }

         //search for x
         Node prevx = null;
         Node currX = head;
         while (currX != null && currX.data != x){
           prevx = currX;
           currX = currX.next;
         }

         //search for y
         Node prevY = null,currY = head;
         while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
         }

         //if x and y not present 
         if(currX == null || currY == null) return;

         //if x is not head
         if(prevx != null){
            prevx.next = currY;
         }else{
            head = currY;
         }
            //if y is not head
            if(prevY != null){
                prevY.next = currX;
         }else{
            head = currX;
         }  

         //swap next pointer
         Node temp = currX.next;
         currX.next = currY.next;
         currY.next = temp;
    }

    //insert at beging
    public void push(int data){
        Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
    }

    //print 
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        soultion list = new soultion();

        // Push some nodes
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.print();
        list.swap(4, 6);
        System.out.println("after swaping list");
        list.print();
    }
}
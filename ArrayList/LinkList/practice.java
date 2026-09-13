import java.util.*;
public class practice {

/*
Question: What linked-list intersection algorithm was intended in this practice file?
Example: Two lists sharing a tail node should report the first common node.
*/
    public class Node{
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


    //method 
    //q1 find the inter section of two linked list
    public Node getIntersection(Node head1,Node head2){
        while(head2 != null){
            Node temp = head1;
            while(temp != null){
               if(temp == head2){
                return head2;
               }
               temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        practice ll = new practice();
        Node head1,head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9)
    }
}

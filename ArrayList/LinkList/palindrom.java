package LinkList;

public class palindrom {

/*
Question: How do you check whether a singly linked list is a palindrome using a middle split and reversal?
Example: 1 -> 2 -> 2 -> 1 returns true.
*/
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

    //add first
        public void addFirst(int data){
            node newNode = new node(data);

            if(head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //print 
        public void print(){
            if(head == null){
                System.out.println("no linked list");
                return;
            }
            //print 
            node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        //check palindrom
        public node mid(node head){
            //here we use slow-fast technique
            node slow = head;
            node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // now check for palinderom
        public boolean palindromcheck(){
            if(head == null || head.next == null){
                return true;
            }
             //step -1 call mid point
            node midpoint = mid(head);

            //step-2 reverse the 2nd half
            node prev = null;
            node curr = midpoint;
            node next;
            while (curr != null) {
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;                
            }
            node right = prev;
            node left = head;

            //step-3compare left half and right half
            while(right!= null){
                if(left.data != right.data){
                    return false;
                }
                left =left.next;
                right = right.next;
            }
            return true;
        }

    public static void main(String[] args) {
        palindrom ll = new palindrom();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);;
        ll.print();
        System.out.println(ll.palindromcheck());
        
    }
}

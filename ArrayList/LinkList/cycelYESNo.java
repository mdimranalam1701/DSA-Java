package LinkList;

public class cycelYESNo {

/*
Question: How does Floyd's cycle detection find and remove a loop in a linked list?
Example: If a list loops back, slow and fast pointers eventually meet.
*/
    public static class node{
         int data;
         node next;

         public node(int data){
            this.data =data;
            this.next = null;
         }
    }
    public static node head;
    public static node tail;
    public static int size;

    public static boolean isCycle(){
        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removecycle(){
        //detect cycle
        node slow = head;
        node fast =  head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeing pouint
        slow = head;
        // node prev = null;
        while (slow != fast) {
            // prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // prev.next = null;
        fast.next = null;
    }

    public static void main(String[] args) {
        // cycelYESNoll ll = new cycelYESNo();
        head = new node(1);
        node temp = new node(2);
        head.next = temp;
        head.next.next= new node(3);
        head.next.next.next = temp;
        // head.next.next.next = new node(1);
        //1==>2==>3==>1
        System.out.println(isCycle());
        removecycle();
        System.err.println(isCycle());
    }
}

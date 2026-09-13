import java.util.*;

public class sortCollections {
/*
Question: How does Collections.sort arrange an ArrayList, and how do you reverse the order?
Example: List {4,1,9,2} -> ascending {1,2,4,9}.
*/
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(12);

        System.out.println(list);
         Collections.sort(list); //ascending
         System.out.println(list);
         Collections.sort(list,Collections.reverseOrder());
         System.out.println(list);
         //comparator - function logic define
    }
}

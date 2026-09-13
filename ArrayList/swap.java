import java.util.ArrayList;

public class swap {
    // public static void swap(ArrayList<Integer> list,int idx1,int idx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1,list.get(idx2));
    //     list.set(idx2,temp);
    // }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp =list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
/*
Question: How do you swap two elements in an ArrayList using get and set?
Example: Swap positions 1 and 3 in {10,20,30,40} -> {10,40,30,20}.
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
         
         int idx1 =1, idx2 =3;
         System.out.println(list);
         swap(list,idx1,idx2);
         System.out.println(list);
    }
}

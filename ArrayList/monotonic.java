import java.util.ArrayList;

public class monotonic {
    public static boolean monotonic(ArrayList<Integer> list){
/*
Question: How do increasing and decreasing flags determine whether an ArrayList is monotonic?
Example: {1,2,2,3} is monotonic, while {1,3,2} is not.
*/
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i) < list.get(i+1)){
                dec =false;
            }
        }
        return inc || dec;
    }

    public static boolean monotonichai(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<list.size()-1;i++){
           if(list.get(i)>list.get(i+1)){
            inc = false;
           }
           if(list.get(i) < list.get(i+1)){
            dec = false;
           }
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        // // System.out.println(monotonic(list));
        System.out.println(monotonichai(list1));
        System.out.println("------------------------");
        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        System.out.println(monotonichai(list2));
    }
}

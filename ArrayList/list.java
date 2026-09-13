import java.util.*;
public class list{
/*
Question: How do you scan an ArrayList to find the largest and smallest values?
Example: List {4, 9, 2, 7} -> largest 9 and smallest 2.
*/
    public static void main(String args[]){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(54);
            list.add(16);

            int Max = Integer.MIN_VALUE;
            int Min = Integer.MAX_VALUE;
            for(int i=0;i<list.size();i++){
                Max = Math.max(Max,list.get(i));
                Min = Math.min(Min,list.get(i));
            }
            System.out.println("max:"+Max+"/n"+"min:"+Min);
    }
}
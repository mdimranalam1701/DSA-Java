import java.util.ArrayList;

public class pairSum {

/*
Question: How do brute force and two-pointer methods find a pair with a given sum in an ArrayList?
Example: List {1,2,3,4,5}, target 7 -> pair (2,5) or (3,4).
*/
    public static boolean pairSum(ArrayList<Integer>list,int target){
        //brute force
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }


    //optimize array is sorted then only
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size()-1;
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target ){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            if(list.get(lp) + list.get(rp) > target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        pairSum(list,target);
        // System.out.println(pairSum(list, target));
        System.out.println(pairSum2(list, target));
    }
}

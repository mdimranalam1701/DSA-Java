import java.util.ArrayList;

public class lonelyno {
/*
Question: What makes a number "lonely" in an array, and how do you check for missing neighbors?
Example: Input {10,6,5,8} -> lonely numbers are values whose x-1 and x+1 do not appear.
*/

    public static ArrayList<Integer> findLonely(int[] nums){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int num : nums){
            list1.add(num);
        }
        for(int num:nums){
            if(!list1.contains(num-1) && !list1.contains(num+1)){
                list2.add(num);
            }
        }
        return list2;
    }


    public static ArrayList<Integer> akelaele(int[] nums){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num : nums){
            list1.add(num);
        }
        for(int num : nums){
            if(!list1.contains(num-1) && !list1.contains(num+1)){
                list2.add(num);
            }
        }
        return list2;
    }
    public static void main(String[] args) {
        //eg nums [10,6,5,8] if x =10 it should not have x-1 aand x-2 then 10 is lonely
        int [] nums = {10,6,5,8};
        // System.out.println(findLonely(nums));
        System.out.println(akelaele(nums));
    }
}

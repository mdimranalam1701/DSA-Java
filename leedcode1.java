import java.util.*;

public class leedcode1 {

    public static int[] sum(int nums[],int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target -nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
/*
Question: How does the two-sum hash map approach find two numbers that add to the target?
Example: nums {2,7,11,15}, target 9 -> indices 0 and 1.
*/
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target = 9;
    }
}

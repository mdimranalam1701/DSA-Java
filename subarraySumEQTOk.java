import java.util.*;
public class subarraySumEQTOk {


    public static void subArsumEQtok(int nums[],int key){
        int n = nums.length;
        int currSum =0;
        int start=0;
        int end = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            currSum += nums[i];
            if(currSum -key == 0){
                start =0;
                end=i;
                break;
            } else if(map.containsKey(currSum - key)){
                start =map.get(currSum - key)+1;
                end = i;
                break;
            }
            
        }
        if(end == -1){
            System.out.println("not found");
        }else{
            System.out.println("founded");
            for(int i=start;i<=end;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
        }
    }
/*
Question: How do prefix sums and a map help find a subarray with a given target sum?
Example: Array {1,2,3,7,5}, target 12 -> subarray 2, 3, 7.
*/
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        subArsumEQtok(nums, 3);
    }
}

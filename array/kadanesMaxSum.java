/*
Question: How does Kadane's algorithm find the maximum subarray sum?
Example: Array {-2,1,-3,4,-1,2,1,-5,4} -> output 6.
*/
import java.util.*;
public class kadanesMaxSum {
    public static void  Maxsum(int[] nums){
        //kedans basecaily sub aaray mai jaha negative aajaye vaha ham zero kad dygy
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0;i<nums.length;i++){
            currSum += nums[i];
            if(currSum < 0) currSum =0;
            maxSum = Math.max(maxSum, currSum);
        }
    System.out.println("max sum by kadanes algo: "+maxSum);
    }



    //kadanesalgo
    public static void ke(int[] nums){
        int max = Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0;i<nums.length;i++){
            currsum += nums[i];
            if(currsum < 0) currsum =0;
            max =Math.max(max,currsum);
        }
        System.out.println("max is will be "+max);
    }
    public static void main(String[] args) {
        int nums[] ={-2,-3,4,-1,-2,1,5,-3};
        Maxsum(nums);
        ke(nums);


    }
}

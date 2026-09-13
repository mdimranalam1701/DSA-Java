public class maxSumofArray {
    //brute force time com o(n^3)
    public static void MaxSum(int[] nums){
        int MaxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int start =i;
            for(int j=i;j<n;j++){
                /*
                Question: How do you compute the maximum subarray sum by checking every possible subarray?
                Example: Array {1,-2,6,-1,3} -> best sum 8.
                */
                import java.util.*;
                int currSum = 0;
                for(int k=start;k<=end;k++){
                    currSum += nums[k];
                    if(MaxSum < currSum) MaxSum = currSum;
                }
                
            }
        }
        System.out.println("maxsum is:"+MaxSum);
    }

    //maxsum
    public static void maximum(int[] nums){
        int maxx = Integer.MIN_VALUE;
        int curSum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                   int end = j;
                    curSum = 0;
                    for(int k=start;k<=end;k++){
                        curSum += nums[k];
                        if(curSum > maxx) maxx = curSum;
                    }
                }
        }
        System.out.println("maxsum is " +maxx);
    }

    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        // MaxSum(nums);
        maximum(nums);
    }
}

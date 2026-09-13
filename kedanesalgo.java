public class kedanesalgo {


    public static void kedanesalgomaxSum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum =0;
        for(int i=0;i<nums.length;i++){
            curSum +=nums[i];
            if(curSum <0){
                curSum = 0;
            }
            maxSum = Math.max(maxSum,curSum);
        }
        System.out.println("max sum of sub array :"+maxSum);
    }
/*
Question: How does Kadane's algorithm find the maximum subarray sum in one pass?
Example: Array {-2,1,-3,4,-1,2,1,-5,4} -> output 6.
*/
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        kedanesalgomaxSum(nums);
    }
}

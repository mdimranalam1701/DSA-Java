import java.util.*;


public class maxsubarray{

    public static void prefixSum(int nums[]){
        int n = nums.length;
        int currn=0;
        int maxSum= Integer.MIN_VALUE;
        int prefixArr[] = new int[n];
        prefixArr[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixArr[i] = prefixArr[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            int start =i;
            for(int j=i+1;j<n;j++){
                int end =j;

                currn = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];
                if(maxSum < currn){
                    maxSum = currn;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }
/*
Question: How does prefix-sum logic help compute the maximum subarray sum?
Example: Array {1,-2,6,-1,3} -> output 8.
*/
public static void main(String args[]){
    int nums[] = {1,-2,6,-1,3};
    prefixSum(nums);
}

}
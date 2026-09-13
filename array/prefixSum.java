public class prefixSum {

    //prefix sum
/*
Question: How does a prefix-sum array help compute subarray sums quickly?
Example: Array {1,2,3,4} -> prefix sums {1,3,6,10}.
*/
    public static void prefixSum(int[] nums){
        int currsum =0;
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];
                if(maxSum<currsum) {
                maxSum = currsum;
            }
            }
            
        }
        System.out.println("maxsumm is "+maxSum);
        
    }

    //prefix sum 
    public static void pree(int[] nums){
        int n = nums.length;
        int[] prefixSum = new int[n];
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end =j;
                currsum = start ==0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                if(currsum > maxsum) maxsum = currsum;
            }
        }
        System.out.println("max sum is :" +maxsum);
    }
    public static void main(String[] args) {
        int nums[] ={1,-2,6,-1,3};
        prefixSum(nums);
        pree(nums);
    }
}

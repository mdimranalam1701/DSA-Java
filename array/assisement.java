/*
Question: How can you detect whether an array contains duplicate values?
Example: Input 1, 2, 3, 2 -> output true.
*/
import java.util.*;
public class assisement {
    public static boolean twice(int[] nums){
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(curr ==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        //print input
        for(int i=0;i<n;i++){
            if(i == n-1) System.out.print(nums[i]);
            else{
            System.out.print(nums[i]+",");
            }
        }
        System.out.println();
        System.out.println("output:"+twice(nums));


    }
}

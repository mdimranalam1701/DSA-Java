public class subarray {
    public static void subArray(int[] num){
        int n= num.length;
        for(int i=0;i<n;i++){ //yaha se start mile ga
            int start = i;
           for(int j=i;j<n;j++){
            //yaha se last elemnet mile ga 
            int last = j;
            for(int k=start;k<=last;k++){
                 System.out.print(num[k]+" ");
            }
            System.out.println();
           }
           System.out.println();
        }
    }
/*
Question: How do three nested loops print every contiguous subarray of an array?
Example: Input 1, 2, 3 -> subarrays are 1, 1 2, 1 2 3, 2, 2 3, 3.
*/
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};
        subArray(num);
    }
}

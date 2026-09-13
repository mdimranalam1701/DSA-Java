public class questionfive {
/*
Question: How does Dutch national flag partitioning sort an array of 0s, 1s, and 2s in one pass?
Example: Input 2, 0, 2, 1, 1, 0 -> output 0, 0, 1, 1, 2, 2.
*/
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,0,2};
        int left=0;
        int mid=0; //curent indx
        int right = arr.length-1;
        int[] save = new int[arr.length];
        while (mid<=right) {
            if(arr[mid] == 0){
                // 0 ko left ly kar jao
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;

            }else if(arr[mid]==1){
                mid++;
            }else{
                //2 ko right sen kro
                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
                // mid++ nahi karte, kyunki swap ke baad jo element mid pe aaya
            // usko dobara check karna padega
            }
        }
       for(int ele:arr){
        System.out.print(ele+" ");
       }
    }
}

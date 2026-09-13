public class reverse {
    // public static int[]  rev(int[] num){
    //     int arr[] = new int[num.length];
    //     int j=0;
    //     for(int i=num.length-1;i>=0;i--){
    //             arr[j++] = num[i];  
    //     }
    //     return arr;
        
    // }
    public static void reverseNum(int[] num){
        int first =0;
        int last = num.length-1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] =temp;
            first++;
            last--;
        }
    }
/*
Question: How do two pointers reverse an array in place without extra memory?
Example: Input 1, 2, 3, 4 -> output 4, 3, 2, 1.
*/
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        // // int[] revArr = rev(num);
        // for(int i=0;i<revArr.length;i++){
        //     System.out.println(revArr[i]);
        // }
        reverseNum(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}

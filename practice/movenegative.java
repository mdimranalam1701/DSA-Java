public class movenegative {

    public static int[] move(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
/*
Question: How do you move all negative numbers to the front of an array in place?
Example: Input 2, -3, 1, -1 -> negatives move before positives.
*/
    public static void main(String[] args) {
        int[] arr ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);

        for(int num:ans){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
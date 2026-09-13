public class backtrackArry {

    public static void changeArr(int arr[],int i,int val){
/*
Question: How does backtracking change an array value before recursion and undo it afterward?
Example: Set arr[0]=5, recurse, then restore the previous value on return.
*/
        if(i == arr.length){
            PrintArr(arr);
            return;
        }  //base case
        
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] -2; // backtraking always after function callmm
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        PrintArr(arr);
    }
}
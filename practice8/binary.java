public class binary {
/*
Question: How does binary search repeatedly halve the search space in a sorted array?
Example: Array {1,3,5,7,9}, key 7 -> found.
*/
    public static void main(String[] args) {
        int arr[] ={10,20,30,40};
        int target = 40;
        int index =-1;
        int low =0;
        int high = arr.length-1;
                //this can apply only when it is sort array   
        while (low <= high) {
            int mid= ( low + high)/2;

   if((arr[mid] == target)){
                 index = mid;
                break;
            }else if(arr[mid] < target){
                low = mid +1;
            }else if(arr[mid] > target){
                high = mid-1;
            }
        }
        if(index != -1){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
}

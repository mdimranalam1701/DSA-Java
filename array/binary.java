/*
Question: How does iterative binary search find a target in a sorted array?
Example: Array {2,4,6,8,10,12,14}, key 10 -> index 4.
*/
public class binary {
    public static int BinarySeach(int[] number,int key){
        int start =0;
        int end = number.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(key == number[mid]){
               return mid;
            }
            if(key > number[mid]){
               start = mid+1;
            }
            if(key < number[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("found at index "+BinarySeach(number, key));
    }
}

/*
Question: How can you find the largest and smallest values in an array using both built-in and manual comparisons?
Example: Input 5, 9, 2, 7 -> max 9 and min 2.
*/
import java.util.*;
public class largestsmallest {
    public static void compair(int[] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            largest = Math.max(largest,curr);
            smallest = Math.min(smallest,curr);
        }
        System.out.println("largest elemnet:"+largest);
        System.out.println("smalest element:"+smallest);
    }
    static void comapiaiele(int[] arr){
        int largest=arr[0];
        int smallest = arr[0];
        for(int ele : arr){
            if(ele > largest) {
                largest = ele;
            }else if( ele < smallest){
                smallest = ele;
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("smallest"+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        sc.close();
        compair(arr);
        comapiaiele(arr);
    }
}

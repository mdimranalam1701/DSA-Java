import java.util.Scanner;
/*
Question: Why sort an array first before printing one part in increasing order and the other part in decreasing order?
Example: Input 3, 1, 4, 2 -> sorted and split output.
*/
import java.util.*;
public class rearangeinceasing {
    static void reaagrang(int[] arr){
        // HALF IN INCREACING THE HALF DECREACING
        //INPUT 8 7 1 6 5 9
        //OUTPUT 1 5 6 9 8 7
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        //decreacing
        for(int i=arr.length-1;i>=arr.length/2;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++){
          arr[i] = Integer.parseInt(str[i]);
        }
        reaagrang(arr);
    }
}

import java.util.Scanner;

public class linersearch {
    public static void main(String args[]){
/*
Question: How does linear search scan each element until it finds a match?
Example: Array {4,8,1,9}, key 1 -> found at index 2.
*/
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int index = -1; // when top print index

        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("found the number"+index);
        }else{
            System.out.println("not present");
        }
    }
}

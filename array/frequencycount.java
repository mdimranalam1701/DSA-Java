/*
Question: How do you count the frequency of each integer in an array using a HashMap?
Example: Input 1, 2, 2, 3, 3, 3 -> output counts for 1, 2, and 3.
*/
import java.util.*;
public class frequencycount {

    public static void freq(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int elm:arr){
            map.put(elm,map.getOrDefault(elm,0)+1);
        }

        //print frequency
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        int []arr = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i].trim());
        }
       freq(arr);
        sc.close();
    }
}

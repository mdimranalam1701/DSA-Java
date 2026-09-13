/*
Question: How does this program use frequency counting to find the most common value group?
Example: Input 1, 1, 2, 2, 2, 3 -> highest frequency is 3.
*/
import java.util.*;
public class maxfrequencysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] part = sc.nextLine().split(",");
        int arr[] = new int[part.length];
        for(int i=0;i<part.length;i++){
            arr[i]= Integer.parseInt(part[i].trim());
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        //max frequency
    int maxfreq =0;
        for(Map.Entry<Integer,Integer> freq : map.entrySet()){
            maxfreq = Math.max(maxfreq,freq.getValue());
        }

        int sum =0;
        // for(int ele:map.values()){
        //     if(maxfreq == ele){
        //         int element = ele;
        //         sum += ele;
        //     }
                 
        // }
        int maxelem = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             if(entry.getValue() == maxfreq){
                sum += entry.getValue();
                 maxelem = entry.getKey();
             }

        }
        System.err.println(sum+"max element:"+maxelem);
        

    }
}

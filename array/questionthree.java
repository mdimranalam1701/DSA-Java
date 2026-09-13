import java.util.*;
public class questionthree {
    public static void findtheoddone(char[] arr){
        Map<Character,Integer> map = new HashMap<>();
        boolean isfound = false;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
              if(entry.getValue() % 2 != 0){
                isfound = true;
                System.out.print(entry.getKey()+" ");
              }
        }
        // if(!isfound){
        //     System.out.println("NOT FOUND");
        // } 
    }
/*
Question: How do you find characters that occur an odd number of times in a string?
Example: "aabbccd" -> output d.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.next().charAt(0);
        }
        findtheoddone(arr);
        sc.close();
    }
}

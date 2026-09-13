import java.util.*;
public class questionsix {

    public static String longestcommonprifix(String[] str){
      StringBuilder ans = new StringBuilder();
      Arrays.sort(str);
      char[] first = str[0].toCharArray();
      char[] last = str[str.length-1].toCharArray();
      for(int i=0;i<first.length;i++){
        if(first[i] != last[i] ){
          break;
        }
        ans.append(first[i]);
      }
       return ans.toString();
    }
  /*
  Question: How do you find the longest common prefix by comparing the sorted first and last strings?
  Example: {"flower", "flow", "flight"} -> "fl".
  */
    public static void main(String[] args) {
        String[] str ={"flower","flow","flight"};
          System.out.println(longestcommonprifix(str));
    }
}


import java.util.*;
public class findStringSubSets{
/*
Question: How do yes/no recursion branches generate all subsets of a string?
Example: "abc" -> subsets include "", "a", "ab", "abc", and so on.
*/
    public static void FindSubsets(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //base case

        //yes case
        FindSubsets(str, ans+str.charAt(i), i+1);

        //no case backtrack

        FindSubsets(str, ans, i+1);
    }

    public static void stringbuildersubset(String str, StringBuilder ans,int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //yes case
        ans.append(str.charAt((i)));
        stringbuildersubset(str, ans, i+1);
        ans.deleteCharAt(ans.length()-1);

        //no
        stringbuildersubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str, "", 0);
        stringbuildersubset(str, new StringBuilder(), 0);

    }
}
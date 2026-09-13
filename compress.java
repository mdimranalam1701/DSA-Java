import java.util.*;
public class compress {

/*
Question: How does run-length compression count repeated characters and build a compressed string?
Example: "aaabbc" -> "a3b2c".
*/
    public static String compress(String str){
        // int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbbccccccdddd";
        System.out.println(compress(str));
    }
}

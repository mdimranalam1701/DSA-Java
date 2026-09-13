public class permutation {

/*
Question: How does string permutation recursion choose one character at a time?
Example: "abc" -> "abc", "acb", "bac", "bca", "cab", "cba".
*/
    public static void FindPermutation(String str,String ans){
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            String NewStr =str.substring(0, i) + str.substring(i+1,str.length()); // abcde = ab + de == abde ,i at c
             FindPermutation(NewStr, ans+curr);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        FindPermutation(str, "");
    }
}

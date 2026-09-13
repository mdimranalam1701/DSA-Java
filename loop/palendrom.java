public class palendrom {

    public static void ispalendrom(int n){
         int temp =n;
        int sum =0;
        while (temp>0) {
            int lastdigit = temp%10;
            sum = sum *10+lastdigit;
            temp /=10;
        }
        if(sum == n){
            System.out.println("number palendrom");
        }else{
            System.out.println("number is not palendrome");
        }
    }

    //palendrom in STRINg
    public static void IspalendromStr(String str){
        boolean ispal = true;
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                ispal = false;
                break;
            }
            left++;
            right--;
        }
        if(ispal == true){
            System.out.println("is palendrom "+str);
        }else{
            System.out.println("string is not a pa;emdro,");
        }
    }
/*
Question: How do number reversal and string comparison each test for palindromes?
Example: 121 is a palindrome, and "level" is also a palindrome.
*/
    public static void main(String[] args) {
        // int n = 12321;
        // ispalendrom(n);
        String str = "level";
        IspalendromStr(str);
       
    }
}

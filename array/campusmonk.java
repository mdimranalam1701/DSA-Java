/*
Question: How does this file solve its screening-style array counting problems?
Example: Use the given input format and observe the printed counts.
*/
import java.util.*;
public class campusmonk {
    static void balance(String str){
        //***### ot 0 mtlb balce hai - mai aata tho start add karte positive mai aata ptlab # add karte
        int startcount =0;
        int hashcount =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '*'){
                startcount++;
            }else{
                hashcount++;
            }
        }
        System.out.println(startcount-hashcount);
    }

    //@2 integer Array Arr of size N the task is to find the count of elements whose value is greater that all of its
    //prior elements. (mtlb particular elemeent apne saare privious element se badha hoga)
    public static int greaterprior(int[] arr){
        int count =1;
        int greaterelement = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>greaterelement){
                count++;
                greaterelement = arr[i];
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        balance(str);
        int arr[] = {7,4,8,2,9};
        System.out.println(greaterprior(arr));
       
    }
}

public class pair{

/*
Question: How do you generate all pairs from an array and find the maximum pair sum?
Example: Input 1, 2, 3, 4 -> pair sums include 3, 4, 5, and 7.
*/
    public static void pairArray(int[] number){
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void pairSum(int[] number){
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                int sum = curr+number[j];
                 MaxSum = Math.max(MaxSum, sum);
            }
        }
        System.out.println("max sum is : "+MaxSum);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        pairArray(number);
        pairSum(number);
        
    }
}
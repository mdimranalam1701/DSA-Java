public class zero_one {
/*
Question: How does row and column parity determine the alternating 0/1 triangle pattern?
Example: n=3 -> 1 / 0 1 / 1 0 1 or the file's chosen parity rule.
*/
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    //even par 1 odd par 0
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

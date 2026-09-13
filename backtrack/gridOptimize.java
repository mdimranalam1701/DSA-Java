public class gridOptimize {

/*
Question: How can the number of grid paths be optimized using combinations instead of recursion?
Example: A 3x3 grid uses a binomial coefficient to count paths.
*/
    public static long fact(int nums){
        int result =1;
        for(int i=1;i<nums;i++){
            result *=i;
        }
        return result;
    }

    public static long grid(int n,int m){
        int totalway = n+m-2;
        int downstep = n-1;
        int rightstep = m-1;

        return fact(totalway)/(fact(downstep)*fact(rightstep));
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(grid(n, m));
    }
}
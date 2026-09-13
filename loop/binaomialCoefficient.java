public class binaomialCoefficient {
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }

    public static int binomiial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bionomialCofficent = fact_n/(fact_r*fact_nmr);
        return bionomialCofficent;
    }
/*
Question: How is nCr computed using factorials in the binomial coefficient formula?
Example: 5C2 = 10.
*/
    public static void main(String[] args) {
        System.out.println(binomiial(5, 2));
    }
}

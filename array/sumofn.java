public class sumofn {
    /*
    Question: How do recursive functions compute the sum of numbers and factorial?
    Example: n=5 -> sum 15 and factorial 120.
    */
    static int sumofN(int n){
        if(n == 0) return 0;
        int rec = sumofN(n-1);
        int totalsum = n+rec;
        return totalsum;
    }
    static int fact(int n){
        if( n == 1) return 1;
        int totalfact = n* fact(n-1);
        return totalfact;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofN(n));
        System.out.println(fact(n));
    }
}

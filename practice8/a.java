public class a{
/*
Question: How do changing spaces and stars create the symmetric pattern in this file?
Example: n=3 -> a mirrored hollow-style star shape.
*/
    public static void main(String args[]){
        int N = 5;
        int space =1;
        for(int row =1;row<=2*N-1;row++){
           if(row <=N){
            //PRINT n-row SAPCES
                for(int j=0;j<N-row;j++){
                    System.out.print(" ");
                }
           }else{
            //print row -N
            for(int j=0;j<row-N;j++){
                System.out.print(" ");
            }
           }

           //print the star
           if(row ==1 || row==(2*N-1)){
            System.out.print("*");
           }else{
            //print start along with spaces
            System.out.print("*");
            for(int i=0;i<space;i++){
               System.out.print(" ");
            }
            System.out.print("*");
            if(row<N){
                space +=2;
            }else{
                space -=2;
            }
           }
           System.out.println();
        }

    }
}
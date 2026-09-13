public class grid{

/*
Question: How do recursive grid-path counts work when only down and right moves are allowed?
Example: A 3x3 grid has 6 paths from start to finish.
*/
    public static int gridfind(int i,int j,int n,int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }

        int way1 = gridfind(i+1, j, n, m);
        int way2 =  gridfind(i, j+1, n, m);
        int totalway = way1+way2;

        return totalway;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.println(gridfind(0, 0, n, m));

    }
}
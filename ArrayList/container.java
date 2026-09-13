import java.util.ArrayList;

public class container {
    public static int StoreWater(ArrayList<Integer>height){
        int maxWater = 0;
        //brute force
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                 int ht = Math.min(height.get(i),height.get(j));
                 int wt = j-i;
                 int currWater = ht*wt;
                 maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    // /2pointer app
    public static int storewater2(ArrayList<Integer> height){
        int maxwater = 0;
        int lp =0;
        int rp = height.size()-1;
        while (lp< rp) {
            int ht = Math.min(height.get(lp),height.get(rp));
            int wt = rp -lp;
            int area = ht *wt;
             maxwater = Math.max(maxwater,area);
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
/*
Question: How does the container-with-most-water problem compare brute force and two-pointer solutions?
Example: Heights {1,8,6,2,5,4,8,3,7} -> max area 49.
*/
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 ,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        
        System.out.println(StoreWater(height));
        System.out.println(storewater2(height));

    }
}

public class trappingWater {
/*
Question: How does the trapping rainwater problem use left-max and right-max arrays to compute water at each index?
Example: Heights {4,2,0,6,3,2,5} -> trapped water is 11.
*/
    public static int TrappingWater(int[] height){
        int  n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        //right max element
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
           right[i] = Math.max(height[i],right[i+1]);
        }
        //upper ka jon array hai vo AUXILIARY Array hai Mtlb Helping Array
        int trapWater = 0;
        int width =1;
        for(int i=0;i<n;i++){
            int waterTrap = Math.min(left[i],right[i]);
            trapWater += waterTrap - height[i]*width; // formula
        }
        return trapWater;
    }

    public static void trap(int[] height){
        int n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        int right[] =new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int waterTraped = 0;
        int width =1;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(left[i],right[i]);
            waterTraped += waterlevel - height[i] *width;
        }
        System.out.println("water traped:"+waterTraped);
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappingWater(height));
        trap(height);

        // time completix is linner O(n);   


    }
}

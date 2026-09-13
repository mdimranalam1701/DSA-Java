/*
Question: How do you find the maximum profit from a single buy-and-sell stock transaction?
Example: Prices {7,1,5,3,6,4} -> output 5.
*/
public class BuyAndSellStock {
    public static int Stock(int[] prices){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] > BuyPrice){
                int profit = prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }else{
                BuyPrice = prices[i];
            }
            
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(Stock(prices));
    }
}

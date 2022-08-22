package shilpa.leetcode;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;

        /*
            int maxProfit=0;
        int profit=0;
        for(int i=0;i< prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++)
            {
                profit=prices[j]-prices[i];
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
         */
    }

    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        int maxProfit=BuyAndSellStock.maxProfit(prices);
        System.out.println(maxProfit);
    }
}

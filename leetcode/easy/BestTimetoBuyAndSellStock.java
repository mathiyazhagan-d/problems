public class BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minPrice=Integer.MAX_VALUE;
        int difference=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice=prices[i];
            difference=prices[i]-minPrice;
            if(profit<difference)
                profit=difference;
        }
        return profit;
    }
}

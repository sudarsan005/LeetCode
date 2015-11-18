/*Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.*/

public class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int minElement = Integer.MAX_VALUE;
        if(prices.length==0 || prices.length<2)
         return 0;
        for(int i=0;i<prices.length;i++)
        {
           /* if(i+1<prices.length && prices[i+1]-prices[i]>profit)
            {
                profit=prices[i+1]-prices[i];
            }*/
            /*else if(profit < prices[prices.length-1] prices[prices.length-1] && i==prices.length-1)
            {
                profit=prices[i];
            }*/
            profit = Math.max(profit, prices[i]-minElement);
            minElement = Math.min(minElement, prices[i]);
        }
        
        return profit;
        
    }
}
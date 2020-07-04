/**
 * I am using a variable minPrice to record the lowest buying price.
 * Then the profit that I can get at selling on ith minute is stockPrices[i] minus the minPrice.
 * I am using variable maxProfit to recorder the maximum profit so far.
 * When the program is iterating through the stock prices list, it updates the corresponding variables when
 * a lower price or a higher profit value can been obtained.
 * When the iteration is complete, I return the current value in maxProfit as the result.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * @author David Yang
 */
public class Solution {

  /**
   * Given an array of integers which the ith element is the price of a given stock on i minutes past trade opening time.
   * This function returns the maximum profit that could have been made at one transaction (i.e buy one and then sell one share of a stock)
   *
   * @param stockPrices an array of stock prices
   * @return the maximum profit value
   */
  public int getMaxProfit(int[] stockPrices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < stockPrices.length; i++) {
      if (stockPrices[i] < minPrice) {
        minPrice = stockPrices[i];
      }
      maxProfit = Math.max(maxProfit, stockPrices[i] - minPrice);
    }
    return maxProfit;
  }

}

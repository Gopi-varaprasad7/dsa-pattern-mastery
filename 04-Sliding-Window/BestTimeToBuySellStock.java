// LeetCode 121
// Pattern : Sliding Window
// Time: O(n)
// Space: O(1)
// Idea : Track the minimum price so far and compute profit for each day.

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){

            if(price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }

        }

        return maxProfit;
    }
}
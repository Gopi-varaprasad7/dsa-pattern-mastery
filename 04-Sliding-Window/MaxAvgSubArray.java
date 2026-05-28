// LeetCode 643
// Pattern : Sliding window
// Time : O(n)
// Space : O(1)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;
        for(int i = 0; i < k ; i++){
            currentSum += nums[i];
        }
        double max = currentSum;
        for(int i = k; i < nums.length; i++){
            currentSum += nums[i] - nums[i - k];
            max = Math.max(max,currentSum);
        }
        return max / k;
    }
}
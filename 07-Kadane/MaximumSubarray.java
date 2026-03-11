// LeetCode 53
// Pattern : Kadane's Algorithm
// Time : O(n)
// Space : O(1)
// Idea : Keep track of current sum and reset when it becomes negative.

class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }
}
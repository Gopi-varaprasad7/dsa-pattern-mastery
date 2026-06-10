// LeetCode 209
// Pattern : Sliding window
// Time : O(n)
// Space : O(1)
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int current_sum = 0;
        int min_length = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            current_sum += nums[right];
            while (current_sum >= target) {
                min_length = Math.min(min_length, right - left + 1);
                current_sum -= nums[left];
                left++;
            }
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
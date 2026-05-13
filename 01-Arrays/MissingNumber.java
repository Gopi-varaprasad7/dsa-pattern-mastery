// LeetCode 268
// Pattern : Gauss Formula
// Time : O(n)
// Space : O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expect = n * (n + 1) / 2;
        int orig = 0;
        for(int num : nums){
            orig += num;
        }
        return expect - orig;
    }
}
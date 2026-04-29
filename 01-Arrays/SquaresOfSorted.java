// LeetCode 977
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)
// Idea :Set i at 0 j at length - 1 Looping throug length to 0 array ,check squares place big one at ith index of rusult array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int left = 0, right = nums.length -1;
        for(int i = right; i >= 0; i--){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare){
                result[i] = leftSquare;
                left++;
            }
            else{
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
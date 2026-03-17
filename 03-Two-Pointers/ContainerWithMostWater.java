// LeetCode 11
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)
// Idea : Move the pointer with smaller height to maximize area.

class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while(left < right){

            int h = Math.min(height[left], height[right]);
            int width = right - left;

            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
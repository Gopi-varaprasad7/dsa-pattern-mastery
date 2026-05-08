// LeetCode 88
// Pattern : three Pointers
// Time : O(n)
// Space : O(1)
// Idea :Set i and j , loop until j reaches to end of array while cheking value even or odd

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int i = 0, j = 0;
        while(j < nums.length){
            if(nums[j] % 2 != 0){
                j++;
                continue;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}
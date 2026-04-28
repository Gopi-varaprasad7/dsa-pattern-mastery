// LeetCode 27
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)
// Idea : Assuming first value of array as unique , roatating loop from one and check if ith value and val same, if same escape the perticular loop else storing in array and return index as length

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
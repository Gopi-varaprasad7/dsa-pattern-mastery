// LeetCode 26
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)
// Idea : Assuming first value of array as unique , roatating loop from one and check if 0th and 1st value of arrya same, if same escape the perticular loop else storing in array and return index +1 as length

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[index]){
                continue;
            }
            else{
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
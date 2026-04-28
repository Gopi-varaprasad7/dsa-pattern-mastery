// LeetCode 283
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)
// Idea : looping though array if ith value is 0 continue else add the value at index, if index not equal to array length add zeros

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
        System.out.print("[");
        for(int e : nums){
            if(e == index){
                System.out.print(e);
            }
            System.out.print(e+",");
        }
        System.out.print("]");
    }
}
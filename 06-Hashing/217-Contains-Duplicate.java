 // LeetCode 217
 // Pattern : Hashing
 // Time: O(n)
 // Space: O(n)
 // Idea : Use HashSet for O(1) lookup

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int e : nums){
            if(set.contains(e)){
                return true;
            }
            set.add(e);
        }
        return false;
    }
}
// LeetCode 560
// Pattern : Prefix Sum + HashMap
// Time : O(n)
// Space : O(n)
// Idea : If prefixSum - k exists in map, a subarray with sum k exists.

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int num : nums){
            prefixSum += num;
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }
        return count;
    }
}
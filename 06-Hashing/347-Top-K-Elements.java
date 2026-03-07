// LeetCode 347
// Pattern : Hashing + Bucket Sort
// Time : O(n)
// Space : O(n)
// Idea : 
// 1. Use HashMap to store frequency of each number.
// 2. Create bucket array where index represents frequency.
// 3. Place numbers in bucket based on their frequency.
// 4. Traverse bucket from highest frequency to get top k elements.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequency
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        // Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;

        for(int i = bucket.length - 1; i >= 0 && index < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[index++] = num;
                    if(index == k) break;
                }
            }
        }

        return result;
    }
}

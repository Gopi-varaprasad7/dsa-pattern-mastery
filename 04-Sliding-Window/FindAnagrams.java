// LeetCode 438
// Pattern : Sliding window
// Time : O(n)
// Space : O(1)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s == null || p == null || s.length() < p.length()){
            return list;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(int i = 0; i < p.length(); i++){
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(pCount,sCount)){
            list.add(0);
        }
        for(int i = p.length(); i < s.length(); i++){
            sCount[s.charAt(i) - 'a']++;
            int leftIndex = s.charAt(i - p.length()) -'a';
            sCount[leftIndex]--;
            if(Arrays.equals(pCount,sCount)){
                 list.add(i-p.length() + 1);
            }
        }
        return list;
    }
}
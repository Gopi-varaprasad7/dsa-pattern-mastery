// LeetCode 242
// Pattern: Hashing (Frequency Counting)
// Time Complexity: O(n)
// Space Complexity: O(1) using int[26]
// Idea: Increment for s and decrement for t simultaneously.
// If all frequencies become zero → anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
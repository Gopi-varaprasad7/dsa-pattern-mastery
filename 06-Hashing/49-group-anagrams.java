/*
Problem: LeetCode 49 - Group Anagrams
Pattern: Hashing + Sorting
Approach:
1. Convert each word into a char array
2. Sort the characters
3. Use the sorted string as the key in HashMap
4. Store original words in the list

Time Complexity: O(n * k log k)
n = number of words
k = length of each word

Space Complexity: O(n)
*/
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
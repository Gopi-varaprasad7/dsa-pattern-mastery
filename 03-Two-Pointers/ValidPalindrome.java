// LeetCode 125
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)

class Solution {
    public boolean isPalindrome(String s) {
        String re = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'){
                re += ch;
            }
        }
        re = re.toLowerCase();
        int left = 0; 
        int right = re.length() - 1;
        while(left < right){
            char ch1 = re.charAt(left);
            char ch2 = re.charAt(right);
            if(ch1 != ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
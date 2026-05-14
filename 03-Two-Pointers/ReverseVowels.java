// LeetCode 345
// Pattern : Two Pointers
// Time : O(n)
// Space : O(1)

class Solution {

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left < right){
            char ch1 = Character.toLowerCase(ch[left]);
            char ch2 = Character.toLowerCase(ch[right]);
            if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' &&
               ch1 != 'o' && ch1 != 'u'){

                left++;
            }
            else if(ch2 != 'a' && ch2 != 'e' && ch2 != 'i' &&
                    ch2 != 'o' && ch2 != 'u'){

                right--;
            }
            else{

                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}
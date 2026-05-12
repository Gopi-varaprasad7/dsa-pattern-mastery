// LeetCode 278
// Pattern : Binary Search
// Time : O(n)
// Space : O(1)

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}

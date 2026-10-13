class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        
        // Square each element using long to prevent integer overflow
        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        
        java.util.Arrays.sort(sq);
        
        long ans = 0;
        int k = n / 2;
        
        // Subtract the smallest half and add the largest half
        for (int i = 0; i < k; i++) {
            ans -= sq[i];
        }
        for (int i = k; i < n; i++) {
            ans += sq[i];
        }
        
        return ans;
    }
}
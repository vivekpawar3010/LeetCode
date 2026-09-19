class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            if(max < n) max = n;
        }
        int ans = 0;
        for(int n : nums){
            ans += (max - n);
        }
        return ans;
    }
}
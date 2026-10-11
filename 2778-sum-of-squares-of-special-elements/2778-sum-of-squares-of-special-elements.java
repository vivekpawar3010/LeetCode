class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sumsqsp = 0;
        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                sumsqsp += (nums[i] * nums[i]);
            }
        }
        return sumsqsp;
    }
}
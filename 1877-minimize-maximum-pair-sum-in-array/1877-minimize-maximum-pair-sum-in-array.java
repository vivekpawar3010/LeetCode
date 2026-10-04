class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxn = 0;
        for(int i = 0; i <= n/2; i++){
            maxn = max(maxn, nums[i] + nums[n - i - 1]);
        }
        return maxn;
    }
    private int max(int a, int b){
        return a>b? a:b;
    }
}
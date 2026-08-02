class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = 0;
        for(int i = 0; i < k; i++){
            diff += (nums[i] - nums[n - i - 1]);
        }
        return abs(diff);
    }

    private static int abs(int n){
        return n>0? n : -n;
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(idx < i) return false;
            idx = max(idx, i + nums[i]);
        }

        return true;
    }

    private int max(int a, int b){
        return a>b ? a :b;
    }
}
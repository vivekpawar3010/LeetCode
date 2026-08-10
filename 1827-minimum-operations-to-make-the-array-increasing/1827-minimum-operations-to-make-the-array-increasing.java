class Solution {
    public int minOperations(int[] nums) {
        int ans = 0, current = 0;
        for(int i = 0; i < nums.length; i++){
            if(current < nums[i]){
                current = nums[i];
                current++;
            }else if(current > nums[i]){
                ans += (current - nums[i]);
                current++;
            }else{
                // ans++;
                current++;
            }
        }

        return ans;
    }
}
class Solution {
    public boolean sumGame(String num) {
        char[] nums = num.toCharArray();
        int[] sum = {0, 0}, q = {0, 0};
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int j = i / (n >> 1);
            if(nums[i] == '?'){
                q[j]++;
            }else{
                sum[j] += nums[i] - '0';
            }

        }
        return ((q[0] + q[1]) % 2 == 1) || ((sum[0] - sum[1]) << 1) != (q[1] - q[0]) * 9;
    }
}
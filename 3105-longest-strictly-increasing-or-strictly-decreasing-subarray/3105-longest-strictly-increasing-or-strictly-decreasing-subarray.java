class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxlen = 1;
        int incr = 1;
        int desc = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                incr++;
                desc = 1;
            }else if(nums[i] < nums[i - 1]){
                desc++;
                incr = 1;
            }else{
                incr = desc = 1;
            }

            maxlen = maxOfThree(maxlen, incr, desc);
        }
        return maxlen;
    }

    private int maxOfThree(int a, int b, int c){
        return (a > b? (a>c? a : c) : (b > c? b : c));
    }
}
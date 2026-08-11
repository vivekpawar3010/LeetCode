class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = maxInArray(nums);
        return (max * k) + (k*(k- 1)/2);
    }

    private int maxInArray(int[] nums){
        int max = 0;
        for(int num : nums){
            if(num > max) max = num;
        }
        return max;
    }
}
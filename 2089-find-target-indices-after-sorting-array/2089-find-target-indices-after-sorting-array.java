class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int less = 0, same = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < target) less++;
            else if(nums[i] == target) same++;
        }

        List<Integer>result = new ArrayList<>();
        for(int i = 0; i < same; i++){
            result.add(less + i);
        }
        return result;
    }
}
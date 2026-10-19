class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int less = 0, same = 0;
        for (int num : nums) {
            if (num < target) {
                less++;
            } else if (num == target) {
                same++;
            }
        }

        List<Integer>result = new ArrayList<>();
        for(int i = 0; i < same; i++){
            result.add(less + i);
        }
        return result;
    }
}
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length <= 1) {
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];

            if (next - current > 1) {
                for (int missing = current + 1; missing < next; missing++) {
                    result.add(missing);
                }
            }
        }
        
        return result;
    }
}

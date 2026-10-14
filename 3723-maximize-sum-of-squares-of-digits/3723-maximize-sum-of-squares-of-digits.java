class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int[] nums = new int[num];

        for (int i = 0; i < num && sum > 0; i++) {
            nums[i] = (sum > 9 ? 9 : sum);
            sum -= (sum > 9 ? 9 : sum);
        }

        if (sum > 0)
            return "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }

        return sb.toString();
    }
}
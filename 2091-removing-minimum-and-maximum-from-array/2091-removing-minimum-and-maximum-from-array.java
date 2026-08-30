class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minidx = -1;
        int maxidx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minidx = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxidx = i;
            }
        }

        // Make minidx the leftmost index
        if (minidx > maxidx) {
            int temp = minidx;
            minidx = maxidx;
            maxidx = temp;
        }

        // Both from left
        int left = maxidx + 1;

        // Both from right
        int right = n - minidx;

        // Min from left, max from right
        int both = (minidx + 1) + (n - maxidx);

        return min(left, min(right, both));
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }
}
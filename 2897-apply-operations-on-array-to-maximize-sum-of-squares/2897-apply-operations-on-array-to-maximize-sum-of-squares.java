class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[30];
        long ans = 0, mod = 1000000007;

        // Step 1: count the 1-bits in every bit position
        for (int num : nums)
            for (int i = 0; i < 30; i++)
                if ((num & (1 << i)) != 0) bits[i]++;

        // Step 2: build k numbers, each takes one 1-bit from every position that still has one
        while (k-- > 0) {
            long num = 0;
            for (int i = 0; i < 30; i++)
                if (bits[i] > 0) {
                    num |= 1L << i;
                    bits[i]--;
                }
            ans = (ans + num * num) % mod;
        }

        return (int) ans;
    }
}
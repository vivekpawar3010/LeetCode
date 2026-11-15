
class Solution {
    public int numOfSubarrays(int[] arr) {
        long even = 1;
        long odd = 0;
        long ans = 0;
        int parity = 0;
        int MOD = 1000000007;

        for (int n : arr) {
            parity ^= (n & 1);

            if (parity == 0) {
                even++;
                ans += odd;
            } else {
                odd++;
                ans += even;
            }

            ans %= MOD;
        }

        return (int) ans;
    }
}

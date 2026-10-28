class Solution {
    public int divide(int d1, int d2) {
        // Handle the specific 32-bit signed integer overflow edge case
        if (d1 == Integer.MIN_VALUE && d2 == -1) {
            return Integer.MAX_VALUE;
        }
        if (d1 == d2) return 1;

        boolean pos = (d1 < 0 == d2 < 0);
        long a = abs(d1), b = abs(d2);

        long ans = 0;
        while (a >= b) {
            short q = 0;
            while (a > (b << (q + 1))) {
                q++;
            }
            ans += (1L << q); // Use 1L to prevent bit-shift overflow for long
            a = a - (b << q);
        }

        return pos ? (int) ans : (int) -ans;
    }

    private long abs(long n) {
        return n > 0 ? n : -n;
    }
}
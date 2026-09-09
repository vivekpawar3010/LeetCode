class Solution {
    public long countCommas(long n) {
        if(n < 1000000) return max(0l, n - 999l);
        long ans = 0;
        for(long i = 1000; i <= n; i *= 1000){
            ans += n - i + 1;
        }
        return ans;
        
    }
    private long max(long a, long b){
        return a<b? b:a;
    }
    private int max(int a, int b){
        return a<b? b:a;
    }
}
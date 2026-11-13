class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (costBoth >= cost1 + cost2) {
            return (long) cost1 * need1 + (long) cost2 * need2;
        }
        
        int min = min(need1, need2);
        int r1 = need1 - min;
        int r2 = need2 - min;
        
        long ans = (long) min * costBoth;
        ans += (long) r1 * min(cost1, costBoth);
        ans += (long) r2 * min(cost2, costBoth);
        
        return ans;
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }
}

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++){
            if(bitCt(i) == k) ans += nums.get(i);
        }
        return ans;
    }

    private int bitCt(int n){
        int bits = 0;
        while(n > 0){
            bits += n & 1;
            n >>= 1;
        }
        return bits;
    }
    
}
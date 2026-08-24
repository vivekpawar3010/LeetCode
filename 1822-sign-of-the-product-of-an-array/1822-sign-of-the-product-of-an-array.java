class Solution {
    public int arraySign(int[] nums) {
        boolean sign = true;
        for(int num:nums){
            if(num == 0) return 0;
            if(num < 0){
                sign = !sign;
            }
        }
        return sign? 1:-1;
    }
}
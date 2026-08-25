class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] check = new boolean[101];

        for(int num:nums){
            check[num] = true;
        }
        int i;
        for(i = k; i < 101; i += k){
            if(!check[i]) return i;
        }
        return i;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        // int unique = 0;
        // for(int i = 0 ; i < nums.length; i++){
        //     unique = unique ^ nums[i];
        // }
        // return unique;

        int n = nums.length;
        boolean[] b = new boolean[n];
        for(int i = 0; i < n; i++){
            if(b[i]) continue;

            int freq= 1;
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    freq++;
                    b[j]= true;
                }
            }
            if(freq == 1) return nums[i];
        }
        return -1;
    }
}
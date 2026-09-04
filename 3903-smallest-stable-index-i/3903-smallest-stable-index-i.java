class Solution {
    static int[] suffix = new int[100];
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        suffix[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--){
            suffix[i] = min(suffix[ i + 1], nums[i]);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            max = max(max, nums[i]);
            if(max <= k + suffix[i]) return i;
        }

        
        return -1;
    }

    private int max(int a, int b){
        return a<b? b:a;
    }

    private int min(int a, int b){
        return a<b? a:b;
    }
}

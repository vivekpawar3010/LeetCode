class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int max = 0;
        for(int i = 1; i < 101; i++){
            max = max(freq[i], max);
        }
        int ans = 0;
        for(int i = 1; i < 101; i++){
            if(freq[i] == max) ans += max;
        }
        return ans;
    }
    private int max(int a, int b){
        return a<b? b:a;
    }
}
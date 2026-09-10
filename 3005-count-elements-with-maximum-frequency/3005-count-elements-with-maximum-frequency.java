class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0;
        for(int num : nums){
            freq[num]++;
            max = max(freq[num], max);
        }
        // for(int i = 1; i < 101; i++){
        //     max = max(freq[i], max);
        // }
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

        // 0  1  2  3  4  5  6  7  8  9  10
// freq = [0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0]
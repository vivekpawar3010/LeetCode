class Solution {
    public int minTimeToType(String word) {
        int cnt = word.length();
        char prev = 'a';
        for (int i = 0; i < word.length(); ++i) {
            char cur = word.charAt(i);
            int diff = abs(cur - prev);
            cnt += min(diff, 26 - diff);
            prev = cur;
        }
        return cnt;
    }

    private int abs(int n){
        return n > 0? n:-n;
    }
    private int min(int a, int b){
        return a <b? a:b;
    }
}
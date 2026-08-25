class Solution {
    public int countValidPrefixes(String s) {
        int diff = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            diff = (ch=='1')? diff + 1: diff - 1;
            if(diff == 0 || diff == 1 || diff == -1) ans++;
        }
        return ans;

    }
}
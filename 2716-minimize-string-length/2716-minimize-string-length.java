class Solution {
    public int minimizedStringLength(String s) {
        boolean[] check = new boolean[26];
        for(char c : s.toCharArray()){
            check[c - 'a'] = true;
        }
        int ans = 0;
        for(boolean b: check){
            if(b) ans++;
        }
        return ans;
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
        int ct = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') ct++;
            else {
                if(ct > 0) ct--;
                else ans++;
            }
        }
        return ans + ct;
    }
}
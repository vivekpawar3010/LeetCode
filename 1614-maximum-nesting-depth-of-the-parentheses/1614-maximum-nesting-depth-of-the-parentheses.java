class Solution {
    public int maxDepth(String s) {
        int ct = 0;
        int ans = 0;
        for(char ch :s.toCharArray()){
            if(ch == '(') ct++;
            if(ch == ')') ct--;
            ans = ans<ct? ct:ans;
        }
        return ans;
    }
}
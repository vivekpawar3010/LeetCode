class Solution {
    public int countAsterisks(String s) {
        int ct = 0;
        boolean b = true;
        for(char ch : s.toCharArray()){
            if(b && ch == '*') ct++;
            if(ch == '|') b = !b;; 
        }
        return ct;
    }
}
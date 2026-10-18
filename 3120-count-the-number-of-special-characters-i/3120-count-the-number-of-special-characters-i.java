class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] b = new boolean[(123 - 65)];
        for(char ch : word.toCharArray()){
            b[(ch - 'A')] = true;
        }
        int ct = 0;
        for(int i = 0; i < 26; i++){
            if(b[i] && b[i + 32]) ct++;
        }
        return ct;
    }
}
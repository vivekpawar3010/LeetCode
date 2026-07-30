class Solution {
    public char repeatedCharacter(String s) {
        boolean[] check = new boolean[26];

        for(char ch : s.toCharArray()){
            if(check[ch - 'a']){
                return ch;
            }

            check[ch - 'a'] = true;
        }

        return '\0';
    }
}
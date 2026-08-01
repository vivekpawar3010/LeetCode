class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int len = brokenLetters.length();
        if(len == 26) return 0;
        String[] words = text.split(" ");
        int n = words.length;
        boolean[] check = new boolean[26];
        for(char ch : brokenLetters.toCharArray()){
            check[ch - 'a'] = true;
        }

        for(String s: words){
            for(char ch : s.toCharArray()){
                if(check[ch - 'a']) {
                    n--;
                    break;
                }
            }
        }
        return n;
    }
}
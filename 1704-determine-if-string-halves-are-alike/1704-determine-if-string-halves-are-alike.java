class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        return countVowels(s.substring(0, n/2)) == countVowels(s.substring(n/2, n));
    }

    private int countVowels(String s){
        int ct = 0;
        for(char c : s.toCharArray()){
            if(c == 'a' ||c == 'A' ||c == 'e' ||c == 'E' ||c == 'i' ||c == 'I' ||c == 'o' ||c == 'O' ||
            c == 'u' || c == 'U') ct++;
        }
        return ct;
    }
}
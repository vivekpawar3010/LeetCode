class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean chksort = true;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) < s.charAt(i - 1)){
                chksort = false;
                break;
            }
        }

        if(chksort) return 0;
        if(n == 2) return -1;

        // find the smallest and largest character

        char min = s.charAt(0), max = s.charAt(0);
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch < min) min = ch;
            if(ch > max) max = ch;
        }


        if(s.charAt(0) == min || s.charAt(n - 1) == (max)) return 1;

        for(int i =1; i < n -1; i++){
            char ch = s.charAt(i);
            
            if(ch == min || ch == max) return 2;
        }

        return 3;

    }
}
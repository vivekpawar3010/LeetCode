class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i = 0; i <= n/2; i++){

            System.out.println(i + " - " + (n - i - 1));
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(n - i - 1);
            if(ch1 < ch2){
                sb.setCharAt(i, ch1);
                sb.setCharAt(n - i - 1, ch1);
            }else {
                sb.setCharAt(i, ch2);
                sb.setCharAt(n - i - 1, ch2);
            }
        }

        return sb.toString();
    }
}
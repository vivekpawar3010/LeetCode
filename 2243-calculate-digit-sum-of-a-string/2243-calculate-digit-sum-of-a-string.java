class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.length() > k) {
            int i = 0; // Reset i at the start of every round
            while (i < sb.length()) {
                int end = Math.min(i + k, sb.length()); // Use sb.length() instead of k
                String sub = sb.substring(i, end);
                String sumStr = sumDig(sub);
                
                sb.replace(i, end, sumStr);
                
                i += sumStr.length(); 
            }
        }
        return sb.toString();
    }

    private String sumDig(String sub) {
        int sum = 0;
        for (int j = 0; j < sub.length(); j++) {
            sum += sub.charAt(j) - '0';
        }
        return String.valueOf(sum);
    }
}

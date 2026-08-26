class Solution { 
    public String shortestBeautifulSubstring(String s, int k) { 
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        String result = "";
        int left = 0, countOnes = 0;

        for (int right = 0; right < n; right++) {
            // Expand the window by adding the current character
            if (s.charAt(right) == '1') {
                countOnes++;
            }

            // Shrink the window from the left as long as it contains k ones
            while (countOnes == k) {
                int currentLen = right - left + 1;
                String currentSub = s.substring(left, right + 1);

                // Update result if a shorter length is found, 
                // or if the length is equal but alphabetically smaller
                if (currentLen < minLen) {
                    minLen = currentLen;
                    result = currentSub;
                } else if (currentLen == minLen) {
                    if (currentSub.compareTo(result) < 0) {
                        result = currentSub;
                    }
                }

                // Remove the leftmost character and move the left pointer
                if (s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        return result;
    } 
}

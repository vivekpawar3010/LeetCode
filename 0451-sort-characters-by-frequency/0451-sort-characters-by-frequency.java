class Solution {
    public String frequencySort(String s) {
        // Size 128 covers all uppercase ('A'-'Z') and lowercase ('a'-'z') letters
        int[] freq = new int[128]; 
        
        // Count frequencies directly using the character's ASCII value
        for(char ch : s.toCharArray()){
            freq[ch]++; 
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int max = 0;
            int maxIndex = -1;
            
            // Scan through all 128 slots to find the most frequent character left
            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    maxIndex = i;
                }
            }
            
            // If the highest frequency is 0, we've processed every character
            if (max == 0) break;
            
            // Convert the ASCII index back to a character and append it 'max' times
            char ch = (char) maxIndex; 
            for (int i = 0; i < max; i++) {
                sb.append(ch);
            }
            
            // Reset the frequency so we pick the next most frequent character next time
            freq[maxIndex] = 0; 
        }
        
        return sb.toString();
    }
}
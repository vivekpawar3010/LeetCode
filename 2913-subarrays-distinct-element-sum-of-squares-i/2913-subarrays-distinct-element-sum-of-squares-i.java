class Solution {
    public int sumCounts(List<Integer> nums) {
        int sol = 0;
        int n = nums.size(); // Use .size() for Java Lists
        
        // Outer loop defines the starting index of the subarray
        for (int i = 0; i < n; i++) {
            HashSet<Integer> distinctSet = new HashSet<>();
            
            // Inner loop defines the ending index of the subarray
            for (int j = i; j < n; j++) {
                distinctSet.add(nums.get(j)); // Add current element to the set
                
                int distinctCount = distinctSet.size();
                sol += distinctCount * distinctCount; // Square the count and add to total sum
            }
        }
        
        return sol;
    }
}
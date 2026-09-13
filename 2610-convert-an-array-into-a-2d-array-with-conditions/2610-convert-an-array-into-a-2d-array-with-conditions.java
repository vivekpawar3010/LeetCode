class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        while (!freq.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            
            for (int num : new ArrayList<>(freq.keySet())) {
                row.add(num);
                
                freq.put(num, freq.get(num) - 1);
                
                if (freq.get(num) == 0) {
                    freq.remove(num);
                }
            }
            ans.add(row);
        }
        
        return ans;
    }
}

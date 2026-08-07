class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num , 0) + 1);
        }
        n = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 2){
                n ^= entry.getKey();
            }
        }
        return n;
    }
}
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        for(int num : nums){
            int n = temp.size();
            
            for(int i = num; i > 0; i /= 10){
                temp.add(n, i % 10);
            }
        }
        
        int[] ans = new int[temp.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
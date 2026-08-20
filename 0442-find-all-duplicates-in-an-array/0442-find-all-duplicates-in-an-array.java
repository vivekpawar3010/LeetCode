class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] check = new boolean[nums.length];
        List<Integer> ans = new ArrayList<>();

        for(int num : nums){
            if(check[num - 1]){
                ans.add(num);
            }else{
                check[num - 1] = true;
            }
        }
        return ans;
    }
}
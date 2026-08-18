class Solution {
    public int[] minCosts(int[] cost) {
        int[] sct = new int[cost.length];
        int curr = cost[0];
        for(int i = 0; i < cost.length; i++){
            if(curr <= cost[i]){
                sct[i] = curr;
            }else{
                curr = cost[i];
                sct[i] = curr;
            }
        }
        return sct;
    }
}
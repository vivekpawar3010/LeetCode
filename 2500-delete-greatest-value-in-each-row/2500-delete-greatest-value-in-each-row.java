class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        for(int[] nums : grid){
            Arrays.sort(nums);
        }
        int m = grid[0].length;
        int ans = 0;
        for(int j = 0; j < m; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                max = max(max, grid[i][j]);
            }
            ans += max;
        }
        return ans;
    }
    private int max(int a, int b){
        return a<b? b:a;
    }
}
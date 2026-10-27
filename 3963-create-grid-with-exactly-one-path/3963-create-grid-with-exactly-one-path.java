class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            // The first row is completely filled with '.'
            if (i == 0) {
                ans[i] = ".".repeat(n);
            } 
            // All other rows have '#' for the first n-1 characters, and '.' at the end
            else {
                ans[i] = "#".repeat(n - 1) + ".";
            }
        }
        return ans;
    }
}

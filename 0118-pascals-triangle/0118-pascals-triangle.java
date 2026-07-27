class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1); 
            }
            ans.add(row);
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                
                int leftVal = ans.get(i - 1).get(j - 1);
                int rightVal = ans.get(i - 1).get(j);
                
                ans.get(i).set(j, leftVal + rightVal);
            }
        }

        return ans;
    }
}
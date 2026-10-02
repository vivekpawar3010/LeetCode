class Solution {
    private List<String> sol = new ArrayList<>();

    private void backtrack(StringBuilder temp, int open, int close) {
        if (open == 0 && close == 0) {
            sol.add(temp.toString());
            return;
        }

        if (open > 0) {
            temp.append('(');
            backtrack(temp, open - 1, close);
            temp.deleteCharAt(temp.length() - 1);
        }

        if (close > open) {
            temp.append(')');
            backtrack(temp, open, close - 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder str = new StringBuilder();
        backtrack(str, n, n);
        return sol;
    }
}

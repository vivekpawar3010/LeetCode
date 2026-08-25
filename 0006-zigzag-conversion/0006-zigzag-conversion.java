class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] sbarr = new StringBuilder[numRows];

        // Initialize every StringBuilder
        for (int i = 0; i < numRows; i++) {
            sbarr[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for (char ch : s.toCharArray()) {

            sbarr[row].append(ch);

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder sb : sbarr) {
            ans.append(sb);
        }

        return ans.toString();
    }
}
class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        for (char col = s.charAt(0); col <= s.charAt(3); col++) {
            for (char row = s.charAt(1); row <= s.charAt(4); row++) {
                result.add("" + col + row);
            }
        }

        return result;
    }
}
class Solution {
    public int countDaysTogether(String a, String b, String c, String d) {
        return Math.max(0, Math.min(con(b), con(d)) - Math.max(con(a), con(c)) + 1);
    }

    int con(String s) {
        var m = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        var q = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');

        return (275 * m) / 9 - 2 * ((m + 9) / 12) + q  - 30;
    }
}
import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            char c = s.charAt(i);
            
            if (c == '(') {
                int start = i + 1;
                while (i < n && s.charAt(i) != ')') {
                    i++;
                }
                String key = s.substring(start, i);
                sb.append(map.getOrDefault(key, "?"));
            } else {
                sb.append(c);
            }
            i++;
        }

        return sb.toString();
    }
}

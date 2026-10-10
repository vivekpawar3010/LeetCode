// class Solution {
//     public String smallestNumber(String pattern) {
//         ArrayList<Character
//     }
// }
class Solution {
    public String smallestNumber(String s) {
        StringBuilder stk = new StringBuilder(), ans = new StringBuilder();
        int n = s.length();
        for(int i = 0; i <= n; i++){
            stk.append((char)('1' + i));
            if(i == n || s.charAt(i) == 'I'){
                ans.append(stk.reverse());
                stk = new StringBuilder();
            }
        }
        return ans.toString();
    }
}
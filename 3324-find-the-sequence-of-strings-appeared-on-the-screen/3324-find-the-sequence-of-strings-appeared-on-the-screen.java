class Solution {
    public List<String> stringSequence(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char trgChar = s.charAt(i);

            char curr = 'a';
            sb.append(curr);
            ans.add(sb.toString());


            while(trgChar != curr){
                curr++;
                sb.setCharAt(i, curr);

                ans.add(sb.toString());
            }
        }

        return ans;
    }
}
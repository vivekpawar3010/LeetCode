class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleidx = (ruleKey.charAt(0) == 't' ? 0: (ruleKey.charAt(0) == 'c' ? 1:2));
        int ct = 0;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(ruleidx).equals(ruleValue)) ct++;
        }
        return ct;

    }
}
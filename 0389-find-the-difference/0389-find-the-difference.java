class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : t.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()){
            freq.put(ch, freq.get(ch) - 1);
            if(freq.get(ch) == 0) {
                freq.remove(ch);
            }
        }        

        return (char) (freq.keySet().toArray()[0]);
    }
}
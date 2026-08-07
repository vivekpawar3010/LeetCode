class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        boolean[] check = new boolean[n];
        for(int i = 0; i < n; i++){
            if(check[i]) continue;
            for(int j = i + 1; j < n; j++){
                if((words[i].charAt(0) == words[j].charAt(1)) && (words[j].charAt(0) == words[i].charAt(1))){
                    check[j] = true;
                }
            }
        }

        n = 0;
        for(boolean ch : check) if(ch) n++;

        return n;
    }
}
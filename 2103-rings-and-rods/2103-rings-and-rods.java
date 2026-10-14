class Solution {
    public int countPoints(String rings) {
        Set[] rods = new Set[10];

        for(int i = 0; i < 10; i++){
            rods[i] = new HashSet();
        }
        for(int i = 0; i < rings.length(); i += 2){
            int idx = rings.charAt(i + 1) - '0';
            char crl = rings.charAt(i);
            
            rods[idx].add(crl);
        }

        int ans = 0;
        for(int i = 0; i < 10;  i++){
            if(rods[i].size() == 3) ans++;
        }
        return ans;
    }
}
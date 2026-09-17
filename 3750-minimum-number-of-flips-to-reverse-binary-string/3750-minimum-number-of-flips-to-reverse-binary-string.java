class Solution {
    public int minimumFlips(int n) {
        String bin = intToBinary(n);
        
        String rev = reverse(bin);

        if(bin.equals(rev)) return 0;
        int ans = 0;
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) != rev.charAt(i)) ans++;
        }

        return ans;
        
    }
    private String intToBinary(int n){
        return Integer.toBinaryString(n);
    }

    private String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
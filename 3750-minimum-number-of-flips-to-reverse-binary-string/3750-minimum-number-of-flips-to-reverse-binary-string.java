class Solution {
    public int minimumFlips(int n) {
        String bin = intToBinary(n);
    
        // if(bin.equals(reverse(bin))) return 0;
        int ans = 0;
        int len = bin.length();
        for(int i = 0; i < len/2; i++){
            if(bin.charAt(i) != bin.charAt(len - i - 1)) ans += 2;
        }

        return ans;
        
    }
    private String intToBinary(int n){
        return Integer.toBinaryString(n);
    }

    // private String reverse(String s){
    //     return new StringBuilder(s).reverse().toString();
    // }
}
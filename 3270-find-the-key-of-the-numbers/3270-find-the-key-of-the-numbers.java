class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int pow = 1, ans = 0;
        for(int i = 0; i < 4; i++){
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            int n3 = num3 % 10;

            ans = ((n1 > n2)? (n2<n3? n2:n3):(n1<n3? n1:n3)) * pow + ans;
            
            num1/=10;
            num2/=10;
            num3/=10;
            pow = pow * 10;
        }
        return ans;
    }
}
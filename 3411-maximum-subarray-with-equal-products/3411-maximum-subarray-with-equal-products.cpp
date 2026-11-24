class Solution {
public:
    int maxLength(vector<int>& nums) {
        const long long MOD = 1e9 + 7; // Use modular arithmetic to avoid overflow
        int n = nums.size();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            long long prod = 1;
            int gcdVal = nums[i];
            long long lcmVal = nums[i];
            for (int j = i; j < n; j++) {
                prod = (prod * nums[j]) % MOD; // Modular arithmetic to prevent overflow
                gcdVal = gcd(gcdVal, nums[j]);
                lcmVal = (lcmVal * nums[j]) / gcd(lcmVal, nums[j]);
                if (prod == (lcmVal % MOD) * gcdVal) {
                    maxLength = max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
    
private:
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
};

#include <vector>
#include <unordered_map>
#include <algorithm>

class Solution {
public:
    int largestInteger(std::vector<int>& nums, int k) {
        std::unordered_map<int, int> countMap;
        int n = nums.size();
        
        // Iterate through all possible subarrays of size k
        for (int i = 0; i <= n - k; ++i) {
            std::unordered_map<int, bool> seenInSubarray;
            for (int j = i; j < i + k; ++j) {
                if (!seenInSubarray[nums[j]]) {
                    countMap[nums[j]]++;
                    seenInSubarray[nums[j]] = true;
                }
            }
        }
        
        int largestAlmostMissing = -1;
        
        // Find the largest integer that appears exactly once
        for (const auto& pair : countMap) {
            if (pair.second == 1 && pair.first > largestAlmostMissing) {
                largestAlmostMissing = pair.first;
            }
        }
        
        return largestAlmostMissing;
    }
};
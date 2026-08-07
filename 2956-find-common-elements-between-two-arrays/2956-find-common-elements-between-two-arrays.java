class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int common1 = 0, common2 = 0;

        for(int num1: nums1){
            for(int num2 : nums2){
                if(num1 == num2){
                    common1++;
                    break;
                }
            }
        }

        for(int num1: nums2){
            for(int num2 : nums1){
                if(num1 == num2){
                    common2++;
                    break;
                }
            }
        }

        return new int[] {common1, common2};
    }
}
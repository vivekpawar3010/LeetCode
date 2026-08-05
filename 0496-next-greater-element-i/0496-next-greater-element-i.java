class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        int[] ans = new int[n1];
        for(int i = 0; i < n1; i++){
            int greatele = -1;
            for(int num2 : nums2){
                if(nums1[i] == num2 && greatele == -1){
                    greatele = nums1[i];
                }else if(greatele == nums1[i] && greatele < num2){
                    greatele = num2;
                    break;
                }

            }
            ans[i] = (nums1[i] == greatele? -1: greatele);
        }

        return ans;
    }
}
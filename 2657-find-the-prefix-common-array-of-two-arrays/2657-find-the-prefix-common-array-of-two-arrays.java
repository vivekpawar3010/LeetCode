class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length, ct = 0;
        int[] res = new int[n];
        boolean[] seen = new boolean[n];

        for(int i = 0; i < n; i++){
            if(seen[A[i] - 1]) ct++;
            else seen[A[i] - 1] = true;

            if(seen[B[i] - 1]) ct++;
            else seen[B[i] - 1] = true;

            res[i] = ct;
        }
         
        return res;
        
    }
}
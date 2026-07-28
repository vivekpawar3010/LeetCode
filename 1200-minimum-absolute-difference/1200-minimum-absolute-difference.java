class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++){
            if(arr[i + 1] - arr[i] < mindiff){
                mindiff = arr[i + 1] - arr[i];
            }
        }

        for(int i = 0; i < n - 1; i++){
            if(arr[i + 1] - arr[i] == mindiff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
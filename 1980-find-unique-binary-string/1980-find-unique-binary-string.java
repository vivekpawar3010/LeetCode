class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder res = new StringBuilder();

        for(int i = 0 ; i < n; i++){
            if(nums[i].charAt(i) == '0'){
                res.append('1');
            }else{
                res.append('0');
            }
        }
        return res.toString();
    }
}

// class Solution {
//     public String findDifferentBinaryString(String[] nums) {
//         int strlen = nums[0].length();
//         Set<String> unique = new HashSet<>();
//         for(String num:nums){
//             unique.add(num);
//         }

//         String ans = "";
//         ArrayList<String> allPossible = new ArrayList<>();
//         genrate(strlen, "", allPossible);
//         for(String possible:allPossible){
//             unique.add(possible);
//             if(unique.size() != strlen){
//                 return possible;
//             }
//         }
//         return allPossible.get(0);

//     }
//     private int powof2(int n){
//         return 1<<n;
//     }

//     private void genrate(int n, String s, ArrayList<String>res){
//         if(s.length() == n){
//             res.add(s);
//             return ;
//         }

//         genrate(n, s+'1', res);
//         genrate(n, s+'0', res);
//     }
// }
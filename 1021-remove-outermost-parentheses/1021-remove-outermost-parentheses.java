class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int st = 0;
        
        for(char ch : s.toCharArray()){
            
            if(ch == '('){
                if(st > 0) sb.append(ch);

                st++; 
            }else{
                st--;

                if(st > 0) sb.append(ch);
            }

            
        }
        return sb.toString();
    }
}
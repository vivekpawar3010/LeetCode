class Solution {
    public String reverseParentheses(String s) {
        char[] chArr = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] == '('){
                st.push(i);
            }else if(chArr[i] == ')'){
                int start = st.pop();
                reversStr(chArr, start + 1, i - 1);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(char c : chArr) {
            if(c != '(' && c != ')'){
                ans.append(c);
            }
            
        }
        return ans.toString();

    }
    private char[] reversStr(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
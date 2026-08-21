class Solution {
    public String reverseByType(String s) {
        char[] charr = s.toCharArray();
        int j = charr.length - 1;
        int i = 0;
        while(i < j){
            if(!isChar(charr[i])) i++;
            else if(!isChar(charr[j])) j--;
            else {
                char temp = charr[i];
                charr[i] = charr[j];
                charr[j] = temp;
                j--;
                i++;
            }
        }
        i = 0;
        j = charr.length - 1;
        while(i < j){
            if(isChar(charr[i])) i++;
            else if(isChar(charr[j])) j--;
            else {
                char temp = charr[i];
                charr[i] = charr[j];
                charr[j] = temp;
                j--;
                i++;
            }
        }
        return new String(charr);
    }

    private boolean isChar(char ch){
        return ch >= 'a' && ch <= 'z';
    }

}
class Solution {
    public boolean canAliceWin(int n) {
        int str = 10;

        while(str >= 0){
            if(n < str){
                return (str & 1) != 0;
            }
            n -= str;
            str--;
        }
        return false;
    }
}
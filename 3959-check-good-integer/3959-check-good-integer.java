class Solution {
    static int[] sqr ={0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
    public boolean checkGoodInteger(int n) {
        int digitSum = digitSumFun(n);
        while(n > 0){
            digitSum -= sqr[n % 10];
            n /= 10;
            if(digitSum < -50) return true;
        }
        return digitSum <= -50;
    }

    private int digitSumFun(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
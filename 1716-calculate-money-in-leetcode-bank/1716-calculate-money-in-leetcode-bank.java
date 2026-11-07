class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int money = 0;
        for(int i = 0; i < weeks; i++){
            money += 28 + (i * 7);
        }

        for(int i = 1; i <= days;i++){
            money += weeks + i;
        }
        return money;
    }
}
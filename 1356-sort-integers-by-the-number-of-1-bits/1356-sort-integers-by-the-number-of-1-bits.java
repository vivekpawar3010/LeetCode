class Solution {
    public int[] sortByBits(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                int bits1 = bitCounter(arr[j]);
                int bits2 = bitCounter(arr[j + 1]);

                // Compare bit counts first
                if (bits1 > bits2) {
                    swap(arr, j, j + 1);
                }

                // If bit counts are equal, compare values
                else if (bits1 == bits2 && arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    private int bitCounter(int n) {
        int ct = 0;

        while (n > 0) {
            ct += n % 2;
            n /= 2;
        }

        return ct;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
class Solution {
    public int minimumPushes(String word) {
        // return bestWay(word);
        return myWay(word);
    }

    private int bestWay(String word) {
        int q = word.length() >> 3;
        int r = word.length() & 7;
        return ((q << 2) + r) * (q + 1);
    }

    private int myWay(String word) {

        // 26 -> a-z
        // 10 -> 0-9
        // 2  -> * #
        int[] freq = new int[38];

        // Store frequency
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= '0' && ch <= '9') {
                freq[26 + (ch - '0')]++;
            } else if (ch == '*') {
                freq[36]++;
            } else if (ch == '#') {
                freq[37]++;
            }
        }

        // Sort only a-z frequencies in descending order
        for (int i = 0; i < 25; i++) {

            for (int j = 0; j < 25 - i; j++) {

                if (freq[j] < freq[j + 1]) {

                    int temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;
                }
            }
        }

        int total = 0;

        // First 8 -> cost 1
        for (int i = 0; i < 8; i++) {
            total += freq[i] * 1;
        }

        // Next 8 -> cost 2
        for (int i = 8; i < 16; i++) {
            total += freq[i] * 2;
        }

        // Next 8 -> cost 3
        for (int i = 16; i < 24; i++) {
            total += freq[i] * 3;
        }

        // Remaining 2 -> cost 4
        for (int i = 24; i < 26; i++) {
            total += freq[i] * 4;
        }

        // 0-9, * and # -> cost 1
        for (int i = 26; i < 38; i++) {
            total += freq[i] * 1;
        }

        return total;
    }

}
class Solution {
    public String sortVowels(String s) {

        char[] charr = s.toCharArray();

        // Frequency of:
        // A E I O U a e i o u
        int[] freq = new int[10];

        // Step 1: Count vowels and mark their positions
        for (int i = 0; i < charr.length; i++) {

            char ch = charr[i];

            switch (ch) {

                case 'A':
                    freq[0]++;
                    charr[i] = '_';
                    break;

                case 'E':
                    freq[1]++;
                    charr[i] = '_';
                    break;

                case 'I':
                    freq[2]++;
                    charr[i] = '_';
                    break;

                case 'O':
                    freq[3]++;
                    charr[i] = '_';
                    break;

                case 'U':
                    freq[4]++;
                    charr[i] = '_';
                    break;

                case 'a':
                    freq[5]++;
                    charr[i] = '_';
                    break;

                case 'e':
                    freq[6]++;
                    charr[i] = '_';
                    break;

                case 'i':
                    freq[7]++;
                    charr[i] = '_';
                    break;

                case 'o':
                    freq[8]++;
                    charr[i] = '_';
                    break;

                case 'u':
                    freq[9]++;
                    charr[i] = '_';
                    break;

                default:
                    break;
            }
        }

        // Step 2: Put vowels back in sorted order
        char[] vowels = {
            'A', 'E', 'I', 'O', 'U',
            'a', 'e', 'i', 'o', 'u'
        };

        int index = 0;

        for (int i = 0; i < charr.length; i++) {

            if (charr[i] == '_') {

                // Find the next vowel whose frequency is still available
                while (freq[index] == 0) {
                    index++;
                }

                charr[i] = vowels[index];
                freq[index]--;
            }
        }

        return new String(charr);
    }
}
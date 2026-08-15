class Solution {

    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            sb.append(intToBin(str[i]));
            if (i != str.length - 1) sb.append("-");
        }

        return sb.toString();
    }

    private String intToBin(String str) {   // ✅ Changed return type
        int num = Integer.parseInt(str);

        if (num == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int remainder = num % 2;
            binary.append(remainder);
            num /= 2;
        }

        return binary.reverse().toString();
    }
}

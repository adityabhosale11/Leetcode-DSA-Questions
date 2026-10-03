class Solution {
    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int curr = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));

            if (curr < next) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        // Add last character
        ans += getValue(s.charAt(s.length() - 1));

        return ans;
    }

    public int getValue(char c) {

        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
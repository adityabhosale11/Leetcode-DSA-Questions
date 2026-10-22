class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            int counter = 0;

            while (digit > 0) {
                digit = digit / 10;
                counter++;
            }

            if (counter % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}
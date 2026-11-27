class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate the first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove previous element and add new element
            sum = sum - nums[i - k] + nums[i];

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // Return maximum average
        return (double) maxSum / k;
    }
}
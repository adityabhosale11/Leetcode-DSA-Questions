class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = -1;
        int end = -1;

        // Find first occurrence
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                start = mid;
                high = mid - 1;       // move left
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                end = mid;
                low = mid + 1;        // move right
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{start, end};
    }
}
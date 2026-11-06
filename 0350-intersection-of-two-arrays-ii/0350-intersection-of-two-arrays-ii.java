import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store common elements
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        // Step 3: Traverse nums2
        for (int num : nums2) {

            if (map.getOrDefault(num, 0) > 0) {

                result[k] = num;
                k++;

                // Decrease frequency
                map.put(num, map.get(num) - 1);
            }
        }

        // Step 4: Return only filled elements
        return Arrays.copyOf(result, k);
    }
}
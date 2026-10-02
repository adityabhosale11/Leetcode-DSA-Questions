class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] nums, int i, List<Integer> current,
                           List<List<Integer>> ans) {

        // Base case
        if (i == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Yes choice
        current.add(nums[i]);
        backtrack(nums, i + 1, current, ans);

        // No choice
        current.remove(current.size() - 1);
        backtrack(nums, i + 1, current, ans);
    }
}
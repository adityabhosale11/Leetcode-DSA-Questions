class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index[] = new int[2];

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                index[0] = i + 1;
                index[1] = j + 1;
                return index;
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return index;
    }
}
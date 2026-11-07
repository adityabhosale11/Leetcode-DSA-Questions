class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count frequency of magazine characters
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';

            if (freq[index] > 0) {
                freq[index]--;
            } else {
                return false;
            }
        }

        return true;
    }
}
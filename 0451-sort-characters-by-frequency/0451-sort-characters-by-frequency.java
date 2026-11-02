import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add all characters to heap
        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        // Build result
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
class Trie {

    // Structure of each node
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    Node root;

    // Initialize Trie
    public Trie() {
        root = new Node();
    }

    // Insert a word
    public void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search for a complete word
    public boolean search(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
    }

    // Check whether a prefix exists
    public boolean startsWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {

            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
}
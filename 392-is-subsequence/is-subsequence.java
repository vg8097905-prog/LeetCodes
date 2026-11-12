class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t
        
        while (i < s.length() && j < t.length()) {
            // If characters match, move pointer for s forward
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move pointer for t forward
            j++;
        }
        
        // If we matched all characters of s, then it's a subsequence
        return i == s.length();
    }
}
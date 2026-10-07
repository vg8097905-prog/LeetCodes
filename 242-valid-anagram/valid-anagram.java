class Solution {
    public boolean isAnagram(String s, String t) {

        
         char[] chars = s.toCharArray();
         char[] chars1 = t.toCharArray();
        
        // 2. Sort the array (equivalent to std::sort in C++)
        Arrays.sort(chars);
        Arrays.sort(chars1);
        
        return Arrays.equals(chars, chars1);
    }
}
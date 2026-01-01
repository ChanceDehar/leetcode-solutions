class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int max_length = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (seen.containsKey(current) && seen.get(current) >= start) {
                start = seen.get(current) + 1;
            }
            
            seen.put(current, i);
            max_length = Math.max(max_length, i - start + 1);
        }
        
        return max_length;
    }
}
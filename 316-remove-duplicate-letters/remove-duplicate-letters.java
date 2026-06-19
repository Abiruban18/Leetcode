
   public class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        
        // Count frequencies
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            count[c - 'a']--; // Decrement the remaining occurrence count
            
            if (visited[c - 'a']) {
                continue;
            }
            
            // Pop elements that are larger than the current character and appear later
            while (stack.length() > 0 && stack.charAt(stack.length() - 1) > c 
                   && count[stack.charAt(stack.length() - 1) - 'a'] > 0) {
                char removed = stack.charAt(stack.length() - 1);
                visited[removed - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }
            
            stack.append(c);
            visited[c - 'a'] = true;
        }
        
        return stack.toString();
    }
}

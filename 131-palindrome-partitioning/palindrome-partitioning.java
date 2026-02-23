class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        dfs(0, res, sub, s);
        return res;
    }
    
    public void dfs(int start, List<List<String>> res, List<String> sub, String s) {
        if (start == s.length()) {
            res.add(new ArrayList<>(sub));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            String substring = s.substring(start, end + 1);
            if (isPalindrome(substring)) {
                sub.add(substring);
                dfs(end + 1, res, sub, s);
                sub.remove(sub.size() - 1); 
            }
        }
    }
    
    public boolean isPalindrome(String s1) {
        int l = 0, r = s1.length() - 1;
        while (l < r) {
            if (s1.charAt(l) != s1.charAt(r)) {
                return false; 
            }
            l++;
            r--;
        }
        return true;  
    }
}
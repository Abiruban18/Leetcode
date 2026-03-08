class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String result ="";
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i].charAt(i) == '1') {
                result += '0';
            } else {
                result += '1';
            }
        }
        
        return result;
    }
}
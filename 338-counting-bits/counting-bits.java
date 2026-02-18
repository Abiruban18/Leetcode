class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;
            
            // Count number of 1's in binary representation
            while (num > 0) {
                count += num % 2;  // Check if last bit is 1
                num = num / 2;     // Right shift by 1 (divide by 2)
            }
            dp[i] = count;
        }
        return dp;
    }
}
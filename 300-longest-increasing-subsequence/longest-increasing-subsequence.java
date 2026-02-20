class Solution {
    public int lengthOfLIS(int[] nums)
    {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int i = 1;i<nums.length ;i++)
        {
            for(int left=0;left<i;left++)
            {
                if(nums[left]<nums[i])
                {
                    if(dp[left]+1>dp[i])
                    {
                        dp[i] = dp[left] + 1;
                    }
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
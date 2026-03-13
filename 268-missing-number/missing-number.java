class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int tot = 0;
        int i = 0;
        while(i<n)
        {
            tot += nums[i];
            i++;
        }
        return sum - tot;
    }
}
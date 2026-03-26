class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] res = {-1, -1};
        
        // Find first position
        int l = 0, r = nums.length - 1;
        while (l <= r)
        {
            int mid = (l + r) / 2;
            if (nums[mid] == target)
            {
                res[0] = mid;
                r = mid - 1; // move left
            }
            else if (nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        l = 0; 
        r = nums.length - 1;
        while (l <= r)
        {
            int mid = (l + r) / 2;
            if (nums[mid] == target)
            {
                res[1] = mid;
                l = mid + 1; 
            }
            else if (nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        return res;
    }
}
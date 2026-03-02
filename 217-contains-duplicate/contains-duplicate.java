class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> dup = new HashSet<>();
        dup.add(nums[0]);
        for(int i = 1;i<nums.length ;i++)
        {
            if(!dup.contains(nums[i]))
            {
                dup.add(nums[i]);
                continue;
            }
            return true;
        } 
        return false;
    }
}
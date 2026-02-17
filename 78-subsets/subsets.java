class Solution {
    public List<List<Integer>> subsets(int[] nums)
{
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    subs(0,nums,sub,res);
    return res;
}
    public void subs(int n, int[] nums,List<Integer> sub,List<List<Integer>> res)
    {
        if(n >=nums.length)
        {
            res.add(new ArrayList<>(sub));
            return ;
        }
        sub.add(nums[n]);
        subs(n+1,nums,sub,res);
        sub.remove(sub.size() - 1);
        subs(n+1,nums,sub,res);
    } 
}
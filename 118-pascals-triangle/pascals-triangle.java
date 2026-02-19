class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
     List<Integer> sub = new ArrayList<>();
     List<List<Integer>> res = new ArrayList<>();
      List<Integer> sub1=new ArrayList<Integer>();
     sub.add(1);
     res.add(new ArrayList<>(sub));
     sub.clear();
     if(numRows==1)
     {
        return res;
     }
     sub.add(1);
     sub.add(1);
     res.add(new ArrayList<>(sub));
     sub.clear();
     if(numRows==2)
     {
        return res;
     }
    for(int i = 2;i<numRows ;i++)
    {
        for(int j = 0;j<=i;j++)
        {
            if(j == 0 || j == i)
            {
                sub.add(1);
            }
            else{
            sub1=res.get(i-1);
            sub.add(sub1.get(j-1)+sub1.get(j));
            }
        }
        res.add(new ArrayList<>(sub));
        sub.clear();
    }   
    return res;
    }
}
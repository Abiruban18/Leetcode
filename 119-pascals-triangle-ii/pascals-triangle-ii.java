class Solution {
    public List<Integer> getRow(int numRows) {

     List<Integer> sub = new ArrayList<>();
     List<List<Integer>> res = new ArrayList<>();
      List<Integer> sub1=new ArrayList<Integer>();
     sub.add(1);
     res.add(new ArrayList<>(sub));
     sub.clear();
     if(numRows==0)
     {
        return res.get(0);
     }
     sub.add(1);
     sub.add(1);
     res.add(new ArrayList<>(sub));
     sub.clear();
     if(numRows==1)
     {
        return res.get(1);
     }
    for(int i = 2;i<=numRows ;i++)
    {
        for(int j = 0;j<=i;j++)
        {
            if(j == 0 || j == i)
            {
                sub.add(1);
            }
            else{
            sub1=res.get(i-1);
            int a=sub1.get(j-1);
            int b = sub1.get(j);
            int c = a+b;
            sub.add(c);
            }
        }
        res.add(new ArrayList<>(sub));
        sub.clear();
    }   
    return res.get(numRows);
    }

}
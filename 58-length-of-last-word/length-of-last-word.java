class Solution {
    public int lengthOfLastWord(String s) 
    {
        s = s.trim();
        int r = s.length() - 1;
        int l = 0;
        int n = 0;

        while(l<=r)
        {
            if(s.charAt(r) == ' ')
            {
                return n;
            }
            n +=1;
            r--;
 
        }
        return n;
    }
}
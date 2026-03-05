class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int l =0,n = s.length() - 1;
        int[] fre = new int[128];
        int max = Integer.MIN_VALUE;
        if(s.length() == 0)
        {
            return 0;
        }
        for(int r = 0;r<=n;r++)
        {
            Character ch = s.charAt(r);
            fre[ch] ++;
            while(fre[ch] > 1)
            {
                Character c =s.charAt(l);
                fre[c]--;
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
        
    }
}
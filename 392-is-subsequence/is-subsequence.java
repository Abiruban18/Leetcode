class Solution {
    public boolean isSubsequence(String s, String t)
    {
        int l=0,r=0,c=0;
        if(s.length()==0){return true;}
        while(r<t.length() && l<s.length())
        {
            if(s.charAt(l)==t.charAt(r)  )
            {
                r++;l++;c++;
            }
            else
            {
            r++;}
        }
        return c==s.length();
        
    }
}
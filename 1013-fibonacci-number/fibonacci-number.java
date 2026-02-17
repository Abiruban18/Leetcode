class Solution {
    public int fib(int n) {
        int f=0,s=1,t=0;
        if(n<=1){return n;}
        while(n>=2)
        {
            t=f+s;
            f=s;
            s=t;
            n--;
        }
    return t;        
    }
}
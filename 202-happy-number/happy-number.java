class Solution {
    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;

        do {
            slow = getSum(slow);           // move 1 step
            fast = getSum(getSum(fast));   // move 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    private int getSum(int n) 
    {
        int sum = 0;
        while (n > 0) 
        {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
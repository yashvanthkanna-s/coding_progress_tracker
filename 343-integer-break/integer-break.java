class Solution {
    public int integerBreak(int n) {
        int product=1,ans=0;
        if(n==2)
        { 
            return 1;
        }
        if(n==3)
        { 
            return 2;
        }
        while(n>4) 
        {
            product*= 3;
            n-=3;
        }
        ans=product*n;
        return ans;
    }
}

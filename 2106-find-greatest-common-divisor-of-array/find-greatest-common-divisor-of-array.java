class Solution {
    public int findGCD(int[] nums) {
     int max=nums[0];
     int min=nums[0];
     int temp=0;
     for(int n:nums)
     {
        if(n<min)
        {
            min=n;
        }
        if(n>max)
        {
            max=n;
        }
     }   
     while(min%max!=0)
     {
        temp=max%min;
        max=min;
        min=temp;
     }
return max;
    }
}
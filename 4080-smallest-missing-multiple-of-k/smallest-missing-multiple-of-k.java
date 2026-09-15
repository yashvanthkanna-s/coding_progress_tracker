class Solution {
    public int missingMultiple(int[] nums, int k) {
for(int multiple=k;;multiple+=k)
{
    boolean found=false;
    for(int x:nums)
    {
        if(x==multiple)
        {
            found=true;
            break;
        }      
    }if(!found)
        {
           return multiple;
        }
}
    }
}
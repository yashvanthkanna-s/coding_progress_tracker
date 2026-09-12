class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum--;
            }
            else{
                sum++;
            }
            if(mp.containsKey(sum))
            {
                ans=Math.max(ans,i-mp.get(sum));
            }

            else
            {
                mp.put(sum,i);
            }
            
        }
    return ans;
}
}
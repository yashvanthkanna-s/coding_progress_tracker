class Solution {
    public int findLucky(int[] arr) {
         int ans=-1;
     HashMap<Integer,Integer> mp=new HashMap<>();
     for(int n:arr)
     {
        mp.put(n,mp.getOrDefault(n,0)+1);
     }   
    
     for(int n:mp.keySet())
     {
           if(n==mp.get(n))
           {
            ans=Math.max(ans,n);
           }
     }
     return ans;
    }
}
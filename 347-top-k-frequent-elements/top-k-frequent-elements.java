class Solution {
    public int[] topKFrequent(int[] nums,int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
                  int max=-1,key=0;
            for(int x:map.keySet()){
                if(map.get(x)>max){
                    max=map.get(x);
                    key=x;
                }
            }
            ans[i]=key;
            map.remove(key);
        }
        return ans;
    }
}
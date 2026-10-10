
class Solution{
    public int minSteps(String s,String t){
        int[] totcount=new int[26];
        for(int i=0;i<s.length();i++)
        {
            totcount[s.charAt(i)-'a']++;
            totcount[t.charAt(i)-'a']--;
        }
        int step=0;
        for(int i=0;i<26;i++)
        {
            if(totcount[i]>0)
            {
                step+=totcount[i];
            }
        }

        return step;
    }
}

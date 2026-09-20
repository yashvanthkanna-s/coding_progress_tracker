class Solution {
    public int reverseDegree(String s) {
        int deg=0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            int rev=26-(c-'a');
        int ind=i+1;
            deg+=rev*ind;
        }
        return deg;
    }
}

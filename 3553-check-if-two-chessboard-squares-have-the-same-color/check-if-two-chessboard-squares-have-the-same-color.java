 class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

      char c1= coordinate1.charAt(0);
         int r1= coordinate1.charAt(1) -'0';
   char c2=coordinate2.charAt(0);
          int r2=coordinate2.charAt(1) -'0';
        boolean color1= false;
        boolean color2=false;
        if((c1=='a'||c1=='c'||c1=='e'||c1=='g') && r1%2!=0){
            color1 =true;
        }
        else if((c1=='b'||c1=='d'||c1=='f'||c1=='h') && r1%2==0){
            color1 =true;
        }
        if((c2=='a'||c2=='c'||c2=='e'||c2=='g') && r2%2!=0){
            color2 =true;
        }
        else if((c2=='b'||c2=='d'||c2=='f'||c2=='h') && r2%2==0){
            color2 =true;
        }

        if(color1==color2)
            return true;
        
        return false;
    }
}   
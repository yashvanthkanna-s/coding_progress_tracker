class Solution{
public int countNumbersWithUniqueDigits(int n) {
       int count=10;
    int currcount=9;
    int avbl= 9; 
    if (n ==0) {
        return 1;
    }

    for(int length=2;length<=n;length++) {
        currcount=currcount*avbl;
        count=count+currcount;
    avbl--;
    }
    return count;
}
}
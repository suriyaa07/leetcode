class Solution {
    public int[] getNoZeroIntegers(int n) {
    int x = 0;
    int y = 0;
    for(int i = 1;i<n;i++){
        x = i;
        y = n-i;
        if(!String.valueOf(x).contains("0") && !String.valueOf(y).contains("0")){
            return new int[]{x,y};
        }
    }
    return new int[]{1,n-1};
    }
}
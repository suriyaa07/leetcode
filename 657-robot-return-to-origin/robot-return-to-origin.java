class Solution {
    public boolean judgeCircle(String moves) {
        int len = moves.length();
        int l = 0 , r = 0 , u = 0 , d = 0;
        for(int i = 0;i<len;i++){
            if(moves.charAt(i)=='U') u++;
            if(moves.charAt(i)=='D') d++;
            if(moves.charAt(i)=='L') l++;
            if(moves.charAt(i)=='R') r++;
        }
        if (u-d==0 && l-r==0)
            return true;
        
        return false;
    }
}
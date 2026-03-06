class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroFound = false;
        for(int i=1;i<s.length();i++){
            if(!zeroFound){
                if(s.charAt(i)=='0'){
                    zeroFound = true;
                }
            } else {
                if(s.charAt(i)=='1'){
                    return false;
                }
            }
        }
        return true;
    }
}
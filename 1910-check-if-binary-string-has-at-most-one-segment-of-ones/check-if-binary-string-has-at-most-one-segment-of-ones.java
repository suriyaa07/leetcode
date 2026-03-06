class Solution {
    public boolean checkOnesSegment(String s) {
        boolean oneFound = false;
        boolean zeroFound = false;
        
        for(int i=1;i<s.length();i++){
            //zero not found , we are traversing 1 from start
            if(!zeroFound){
                if(s.charAt(i)=='1'){
                    
                } else {
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
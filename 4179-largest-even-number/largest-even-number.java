class Solution {
    public String largestEven(String s) {
        int len = s.length();
        char last = s.charAt(len-1);
        if((last-'0')%2==0) return s;
        if((last-'0')%2!=0 && len<2) return "";
        while(s.length()>1 && (s.charAt(s.length()-1)-'0')%2!=0 ){
            s = s.substring(0,s.length()-1);
        }
        
        if ((s.charAt(s.length() - 1) - '0') % 2 != 0) return "";

        return s;
    }
}
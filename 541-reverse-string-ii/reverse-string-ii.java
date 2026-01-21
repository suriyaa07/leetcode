class Solution {
    public String reverseStr(String str, int k) {
        StringBuilder s = new StringBuilder(str);
        for(int i = 0;i<s.length();i=2*k+i){
            int l = i;
            int r = i+k-1;
            if(r>=s.length()){
                r = s.length()-1;
            }
        while(l<r){
            char temp = s.charAt(l);
            s.setCharAt(l,s.charAt(r));
            s.setCharAt(r,temp);
            l++;
            r--;
        }
        }
    return s.toString();
    }
}
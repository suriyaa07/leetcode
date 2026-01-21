class Solution {
    public String reverseStr(String str, int k) {
        StringBuilder s = new StringBuilder(str);

        for(int i = 0;i<s.length();i=i+2*k){
            int l = i;
            int r = Math.min(i+k-1,s.length()-1);
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
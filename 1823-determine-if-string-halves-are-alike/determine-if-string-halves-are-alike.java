class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String a = s.substring(0,len/2).toLowerCase();
        String b = s.substring(len/2,len).toLowerCase();
        int c1 = 0 , c2 = 0;
        for(int i = 0;i<len/2;i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                c1++;
            } else {
                c1--;
            }

            if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u'){
                c2++;
            } else {
                c2--;
            }

        }
        
        return c1==c2;
    }
}
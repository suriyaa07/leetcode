class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if( (ch<='z' && ch>='a') || (ch<='9'&&ch>='0') ){
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
        for(int i = 0;i<sb.length()/2;i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-i-1))
                return false;
        }
        return true;

    }
}
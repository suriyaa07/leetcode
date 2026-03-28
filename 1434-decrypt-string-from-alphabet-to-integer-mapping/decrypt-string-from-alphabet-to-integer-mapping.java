class Solution {
    public String freqAlphabets(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = len-1;i>=0;i--){
            StringBuilder x = new StringBuilder();
            // if # take 2 steps
            if(s.charAt(i)=='#'){
                x.append(s.charAt(i-2));
                x.append(s.charAt(i-1));
                i = i - 2;
            } else {
                x.append(s.charAt(i));
            }
            sb.append((char)('a'+ Integer.valueOf(x.toString()) - 1));
        }
    return sb.reverse().toString();
    }
}


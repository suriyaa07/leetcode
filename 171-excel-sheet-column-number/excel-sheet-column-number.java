class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i = 0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int current = (ch - 'A' + 1);
            int power = columnTitle.length()-1 - i;
            power = (int)Math.pow(26,power);
            ans+= (power*current);
        }
        return ans;
    }
}


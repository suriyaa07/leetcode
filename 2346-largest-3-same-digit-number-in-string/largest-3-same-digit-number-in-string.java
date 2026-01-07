class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        String str = "";
        for(int i = 0; i <= len-3;i++){
            char x = num.charAt(i);
            if( x == num.charAt(i+1) && x == num.charAt(i+2) ){
                String temp = ""+x+x+x;
                if(temp.equals("") || temp.compareTo(str)>0 ){
                    str = temp;
                }
            }
        }
        return str;
    }
}
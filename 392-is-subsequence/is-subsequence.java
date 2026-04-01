class Solution {
    public boolean isSubsequence(String s, String t) {
        // int index = 0;
        // int sLen = s.length();
        // int tLen = t.length();

        // for(int i = 0;i<sLen;i++){
        //     char ch = s.charAt(i);
        //     // StringBuilder sb = new StringBuilder();
        //     String sub = t.substring(index,tLen);
        //     System.out.println(sub);
        //     boolean found = false;
        //     for(int j = 0;j<sub.length();j++){
        //         if(sub.charAt(j)==ch){
        //             found = true;
        //             index = index + j + 1;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return false;
        //     }
        // }
        // return true;

        int i = 0, j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
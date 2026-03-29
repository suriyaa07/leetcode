class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int len = 0;

        if(l1<l2){
            len = l1;
        }else{
            len=l2;
        }
        for(int i = 0;i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(l1<l2){
            for(int i = len;i<l2;i++){
            sb.append(word2.charAt(i));
        }
        }else{
            for(int i = len;i<l1;i++){
            sb.append(word1.charAt(i));
        }
        }
        return sb.toString();
    }
}
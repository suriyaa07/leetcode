class Solution {
    public String reversePrefix(String word, char ch) {
        int inx = -1;
        int len = word.length();
        for(int i = 0;i<len;i++){
            if(word.charAt(i)==ch){
                inx = i;
                break;
            }
        }
        if(inx ==-1)
            return word;
        
        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0,inx+1)).reverse();
        sb.append(word.substring(inx+1));
        return sb.toString();
    }
}
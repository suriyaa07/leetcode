class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxSpace = 0;
        for(String sentence : sentences){
            int space = 0;
            for(char i : sentence.toCharArray()){
                if(i == ' '){
                    space++;
                }
            }
            if(space > maxSpace){
                maxSpace = space;
            }
        }
        return maxSpace+1;
    }
}
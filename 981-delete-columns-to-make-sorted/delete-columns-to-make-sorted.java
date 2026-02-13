class Solution {
    public int minDeletionSize(String[] str) {
        int colCount = str.length;
        int eachWordLen = str[0].length();
        int count = 0;

        for(int i = 0; i<eachWordLen;i++){
            boolean increment = false;
            char base = str[0].charAt(i);
            for(int j = 1; j<colCount;j++){
                if(base > str[j].charAt(i)){
                    increment = true;
                } else {
                    base = str[j].charAt(i);
                }
            }
            if(increment){
                count++;
            }
        }
    return count;
    }
}
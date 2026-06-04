class Solution {
    public int totalWaviness(int num1, int num2) {
        int wave = 0;
        for(int i = num1;i<=num2;i++){
                String str = String.valueOf(i);
                int len = str.length();
                for(int j = 1;j<len-1;j++){
                    if((str.charAt(j-1)-'0' < str.charAt(j)-'0' && 
                       str.charAt(j)-'0' > str.charAt(j+1)-'0') ||
                       (str.charAt(j-1)-'0' > str.charAt(j)-'0' &&
                       str.charAt(j)-'0' < str.charAt(j+1)-'0')
                       ) wave++;
                }
        }
        return wave;
    }
}
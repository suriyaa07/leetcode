class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        if(!binary.contains("1"))
            return 0;
        if(binary.indexOf('1') == binary.lastIndexOf('1'))
            return 0;
        
        int max = 0;
        int len = binary.length();
        for(int i = 0;i<len-1;i++){
            int count = 0;
            if(binary.charAt(i)=='1'){
            for(int j = i+1;j<len;j++){
                if(binary.charAt(j)=='0'){
                    count++;
                }
                if(binary.charAt(j)=='1'){
                    if(count>max){
                        max = count;
                    }
                    break;
                }
            }
        }
        }
return max +1;
    }
}
class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int len = colors.length;
        for(int i = 0;i<len-1;i++){
            int curr = 0;
            for(int j = i+1;j<len;j++){
                if(colors[i]!=colors[j]){
                    curr = Math.abs(i-j);
                    if(max<=curr)
                        max = curr;
                }
            }
        }
        return max;
    }
}
class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i = 0;i<len-2;i++){
            for(int j = i+1;j<len-1;j++){
                for(int k = j+1;k<len;k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        int abs = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        if(abs<min){
                            min = abs;
                        }
                    }
                }
            }
        }
    if(min == Integer.MAX_VALUE)
        return -1;
    else return min;
    }
}
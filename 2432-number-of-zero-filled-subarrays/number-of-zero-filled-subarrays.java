class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long len = nums.length;
        long count = 0;
        long zeros = 0;
        for(int i = 0; i<len;i++){
                if(nums[i] == 0){
                    zeros ++;
                } else {
                    zeros = zeros * (zeros+1)/2;
                    count = count + zeros;
                    zeros = 0;
                }
        }
        count = count + (zeros * (zeros+1)/2);
        return count;
    }
}
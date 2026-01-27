class Solution {
    public int minimumDifference(int[] nums, int k) {
        int len = nums.length;
        if(len==1){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<len-k+1;i++){
            if(nums[i+k-1] - nums[i] < min){
                min = nums[i+k-1] - nums[i];
            }
        }
        return min;
    }
}
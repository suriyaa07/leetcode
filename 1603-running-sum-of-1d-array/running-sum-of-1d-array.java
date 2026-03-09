class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        int max = 0;
        for(int i = 0;i<len;i++){
            ans[i] = nums[i]+max;
            max = ans[i];
        }
        return ans;
    }
}
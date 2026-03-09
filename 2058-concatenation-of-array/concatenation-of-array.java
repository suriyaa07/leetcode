class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int newLen = len*2;

        int[] ans = new int[newLen];

        for(int i = 0;i<len;i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}
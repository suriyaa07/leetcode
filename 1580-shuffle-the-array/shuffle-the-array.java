class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int i = 0;
        int j = 0;
        while(i<len){
            ans[i] = nums[j];
            ans[++i] = nums[j+n];
            i++;
            j++;
        }
        return ans;
    }
}
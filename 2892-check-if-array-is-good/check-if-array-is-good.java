class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len==1)
            return false;
        if(len==2)
            if(nums[0]==1 && nums[1]==1)
                return true;
        for(int i = 0;i<len-2;i++){
            if(nums[i]!=i+1)
                return false;
        }
        if(nums[len-1] == nums[len-2] && nums[len-1]==len-1)
            return true;

        return false;
    }
}
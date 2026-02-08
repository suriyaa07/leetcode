class Solution {

    private int positive(int[] nums , int len , int index){
        int target = (index+nums[index]) % len;
        if(target < 0)
            target = target+len;
        return nums[target];
    }

    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int result[] = new int [len];
        for(int i=0;i<len;i++){
            if(nums[i] > 0 || nums[i] < 0){
                result[i] = positive(nums,len,i);
            }
            else{
                result[i] = nums[i];
            }
        }
    return result;
    }
}
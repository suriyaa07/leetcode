class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int left[] = new int[len];
        int right[] = new int[len];
        int finall[] = new int[len];

        int leftSum = 0;
        left[0] = 0;
        for(int i = 1;i<len;i++){
            leftSum += nums[i-1];
            left[i] = leftSum;
        }

        int rightSum = 0;
        right[len-1] = 0;
        for(int i = len-2;i>=0;i--){
            rightSum +=nums[i+1];
            right[i] = rightSum;
        }


        for(int i = 0;i<len;i++){
            finall[i] =Math.abs(left[i]-right[i]);
        }




        return finall;
    }
}
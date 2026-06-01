class Solution {
    public int minElement(int[] nums) {
        int min = sumOfDigits(nums[0]);
        int len = nums.length;
        for(int i = 1;i<len;i++){
            min = Math.min(min,sumOfDigits(nums[i]));
        }
        return min;
    }

    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}
class Solution {
    public int countPartitions(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1)
            return 1;
        
        int count = 0;

        for(int i = 1; i< len ; i++){
            int sum1 = 0;
            for(int j = 0; j<i;j++){
                sum1+=nums[j];
            }

            int sum2 = 0;
            for(int k = i; k<len;k++){
                sum2+=nums[k];
            }
            if((sum1+sum2)%2==0){
                count++;
            }
        }
        return count;
    }
}
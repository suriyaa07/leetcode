class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len = queries.length;
        int ans[] = new int[len];
        for(int i = 0;i<len;i++){
            int x = queries[i][0];
            int y = queries[i][1];
            nums[y] = nums[y]+x;
            int sum = 0;
            for(int num : nums){
                if(num%2==0)sum+=num;
            }
            ans[i] = sum;
        }
        return ans;
    }
}
class Solution {
    public int missingInteger(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int len = nums.length;
        sum+=nums[0];
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1;i<len;i++){
            if(nums[i-1]!=nums[i]-1)
                break;
            sum+=nums[i];
        }

    while(set.contains(sum)){
        sum++;
    }
    return sum;
    }
}
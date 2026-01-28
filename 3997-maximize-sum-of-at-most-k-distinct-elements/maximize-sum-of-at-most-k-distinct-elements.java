class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);
        int len = nums.length;
        Set<Integer> set = new LinkedHashSet<>();

        while(len>0 && set.size() < k){
            set.add(nums[len-1]);
            len--;
        }

        int[] ans = new int[set.size()];
        int j = 0;

        for(int i : set){
            ans[j++] = i;
        }
        
        return ans;
    }
}
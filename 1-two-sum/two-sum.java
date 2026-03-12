class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<len;i++){
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y)){
                ans[0] = i;
                ans[1] = map.get(y);
                return ans;
            } else {
                map.put(x,i);
            }
        }
        return null;
    }
}
class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length == 3)
            return nums[0] + nums[1] + nums[2];

        int first = nums[0];
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        return list.get(0)+list.get(1)+first;
    }
}
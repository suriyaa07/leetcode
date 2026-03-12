class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }
        int x = 0;
        for(int i : set){
            nums[x++] = i;
        }
        return set.size();
    }
}
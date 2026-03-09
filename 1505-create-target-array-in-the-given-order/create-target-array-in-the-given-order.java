class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] target = new int[len];
        for(int i = 0;i<len;i++){
            list.add(index[i],nums[i]);
        }
        int x = 0;
        for(int i : list){
            target[x++] = i;
        }
        return target;
    }
}
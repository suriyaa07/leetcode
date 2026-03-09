class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int x = 0;
        int[] arr = new int[len];
        for(int i : nums){
            int count = 0;
            for(int j : nums){
                if(i>j)
                    count++;
            }
        arr[x++] = count;
        }
        return arr;
    }
}
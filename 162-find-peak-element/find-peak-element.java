class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){
                end = mid;       // peak is at mid or left
            } else {
                start = mid + 1; // peak is on right
            }
        }
        return start;
    }
}
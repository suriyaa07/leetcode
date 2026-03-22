class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int pivot = findPivot(nums,start,end);
        //array sorted , avoid nums[-1]
        if(pivot == -1){
            return binarySearch(nums,target,0,len-1);
        }
        //
        if(nums[pivot]==target){
            return pivot;
        }

        //first half 0 to pivot
        if(target >= nums[start]){
            return binarySearch(nums,target,0,pivot-1);
        } else { //first half  pivot to end
            return binarySearch(nums,target,pivot+1,end);
        }
        
    }

    // peak index (or) pivot
    int findPivot(int[] nums ,int start ,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            } 
            if(mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start] < nums[mid]){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    //binary search
    int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            } else if(nums[mid]>target){
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
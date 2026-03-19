/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int start = 0;
        int end = len -1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1))
                start = mid+1;
            else
                end = mid;
        }
    System.out.print(start);
        // we have got the index of the largest element in start=end
        //lets have it as peak
        //lets have a count element
        //now search for target in 0 to peak , peak to end
        int peak = start;
        start = 0;
        end = peak;
        while(start<=end){
            int mid1 = start+(end-start)/2;
            if(mountainArr.get(mid1) < target)
                start = mid1+1;
            else if(mountainArr.get(mid1) > target)
                end = mid1 - 1;
            else
                return mid1;
        }
        start = peak;
        end = len -1;
        while(start<=end){
            int mid2 = start+(end-start)/2;
            if(mountainArr.get(mid2) > target)
                start = mid2+1;
            else if(mountainArr.get(mid2) < target)
                end = mid2 - 1;
            else
                return mid2;
        }
        return -1;
    }
}
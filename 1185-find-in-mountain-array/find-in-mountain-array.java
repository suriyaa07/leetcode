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
        
        // find the largest element and its index
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
        int start1 = 0;
        int end1 = peak;
        while(start1<=end1){
            int mid1 = start1+(end1-start1)/2;

            if(mountainArr.get(mid1) < target)
                start1 = mid1+1;
            else if(mountainArr.get(mid1) > target)
                end1 = mid1 - 1;
            else{
                return mid1;
            }
        }

        int start2 = peak;
        int end2 = len -1;
        while(start2<=end2){
            int mid2 = start2+(end2-start2)/2;

            if(mountainArr.get(mid2) > target)
                start2 = mid2+1;
            else if(mountainArr.get(mid2) < target)
                end2 = mid2 - 1;
            else{
                return mid2;
            }
        }
        return -1;
    }
}
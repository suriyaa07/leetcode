class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        
        int start = 0;
        int end = len -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int startBound = mid-1;
            if(startBound<0)
                startBound = 0;
            int endBound = mid+1;
            if(endBound>len)
                endBound = len-1;

            if(arr[startBound] < arr[mid] && arr[endBound]<arr[mid]){
                return mid;
            } else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
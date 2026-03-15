class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            if(arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
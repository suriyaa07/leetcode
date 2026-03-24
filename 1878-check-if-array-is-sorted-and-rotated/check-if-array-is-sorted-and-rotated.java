class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;

        
        // int pivot = -1;
        // for(int i = 0; i < len - 1; i++){
        //     if(nums[i] > nums[i+1]){
        //         pivot = i;
        //         break;
        //     }
        // }

        // List<Integer> list = new ArrayList<>();

        // if(pivot == -1){
        //     for(int num : nums){
        //         list.add(num);
        //     }
        // } else {
        // for(int i = pivot+1; i < len; i++){
        //     list.add(nums[i]);
        // }
        // for(int i = 0; i <= pivot; i++){
        //     list.add(nums[i]);
        // }
        // }
        // Arrays.sort(nums);

        // for(int i = 0; i < len; i++){
        //     if(nums[i] != list.get(i)){
        //         return false;
        //     }
        // }
        int count = 0;
        for(int i = 0;i<len;i++){
            if(nums[i]>nums[(i+1)%len])
                count++;
        }
        if(count>1)
            return false;

        return true;
        
    }
}
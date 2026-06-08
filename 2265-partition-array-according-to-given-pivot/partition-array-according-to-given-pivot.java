class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();

        for(int i : nums){
            if(i<pivot){
                list.add(i);
            }
        }

        for(int i : nums){
            if(i==pivot){
                list.add(i);
            }
        }

        for(int i : nums){
            if(i>pivot){
                list.add(i);
            }
        }
        int index = 0;
        for(int j : list){
            nums[index] = j;
            index++;
        }
        return nums;
    }
}
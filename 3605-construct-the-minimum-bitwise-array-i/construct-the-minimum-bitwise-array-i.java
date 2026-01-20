class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        for(int num = 0 ;num<nums.size();num++){
            boolean found = false;
            for(int i = 0;i<nums.get(num);i++){
                if((i| (i+1) )== nums.get(num)){
                    arr[num] = i;
                    found = true;
                    break;
                }
            }
            if(!found){
                arr[num] = -1;
            }
        }
        return arr;
    }
}
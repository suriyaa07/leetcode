class Solution {
    public int maxRotateFunction(int[] nums) {
        // int len = nums.length;
        // int rot = len-1;
        // long max = Long.MIN_VALUE;

        // List<Integer> list = new ArrayList<>();
        // for(int i : nums){
        //     list.add(i);
        // }

        // while(rot>=0){
        //     long iterateSum = 0;
        //     for(int i=0;i<len;i++){
        //         iterateSum += (long)list.get(i) * i;
        //     }
        //     if(iterateSum>max) max = iterateSum;
        //     int last = list.remove(len-1);
        //     list.add(0,last);
        //     rot = rot-1;
        // }
        // return (int)max;
        int len = nums.length;
        int k = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<len;i++){
            k += i*nums[i];
            sum+=nums[i];
        }
        max = k;
        
        for(int i = 1;i<len;i++){
            k = k + sum - len * nums[len-i];
            if(k>max) max = k;
        }
    return max;
    }
}
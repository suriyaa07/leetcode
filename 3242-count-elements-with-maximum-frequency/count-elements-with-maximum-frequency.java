class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> list = new HashMap<>();
        for(int i : nums){
            list.put(i,list.getOrDefault(i,0)+1);
        }

        int max = 0;
        for(int i : list.keySet()){
            if(max < list.get(i))
                max = list.get(i);
        }
        int total = 0;
        for(int i : list.keySet()){
            if(list.get(i)==max)
            total+=list.get(i);
        }
    return total;
    }
}
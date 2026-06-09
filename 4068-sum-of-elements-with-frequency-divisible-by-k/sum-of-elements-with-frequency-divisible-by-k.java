class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key)%k==0) count+= (key*map.get(key));
        }
        return count;

    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int arr[] = new int[2];
        int n = 0;

        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            } else {
                arr[n++] = i;
            }
        }
    return arr;
    }
}
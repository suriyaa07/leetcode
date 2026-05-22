class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for(int i : nums){
            String n = "" + i;
            for(int j = 0;j<n.length();j++){
                Integer x = Integer.valueOf( n.charAt(j)-'0' );
                list.add(x);
            }
        }

        int[] ans = new int[list.size()];
        int j = 0;
        for(int i : list){
            ans[j] = i;
            j++;
        }
        return ans;
    }
}
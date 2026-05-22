class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for(int i : nums){
            String n = "" + i;
            for(int j = 0;j<n.length();j++){
                Integer x = Integer.valueOf( String.valueOf(n.charAt(j)) );
                list.add(x);
            }
        }

        int len = list.size();
        int[] ans = new int[len];
        int j = 0;
        for(int i : list){
            ans[j] = i;
            j++;
        }
        return ans;
    }
}
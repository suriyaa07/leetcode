class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int len1 = nums.length;
        Set<String> set = new HashSet<>();
        for(String i : nums){
            set.add(i);
        }
        int n = 1<<len1;
        for(int i = 0;i<n;i++){
            String x = Integer.toBinaryString(i);
            x = String.format("%"+len1+"s",x);
            x=x.replace(' ','0');
            if(!set.contains(x))
                return x;
        }
        return null;
    }
}
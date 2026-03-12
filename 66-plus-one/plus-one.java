class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        List<Integer> list = new ArrayList<>();
        int k = 1;
        while(len>=0 || k!=0){
            if(len>=0){
                k = k+digits[len];
                len--;
            }
            list.add(k%10);
            k/=10;
        }
        int ansLen = list.size();
        Collections.reverse(list);
        int[] ans = new int[ansLen];
        for(int i = 0;i<ansLen;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
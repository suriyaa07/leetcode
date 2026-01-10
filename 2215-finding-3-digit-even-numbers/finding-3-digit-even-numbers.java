class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int len = digits.length;
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                for(int k = 0; k<len; k++){
                    if(digits[i] == 0 || digits[k]%2 != 0 || i==j || j==k || k==i)
                        continue;
                    int x = digits[i]*100 + digits[j]*10 +digits[k];
                    if(!set.contains(x))
                        set.add(x);
                }
            }
        }
        int size = set.size();
        int ans[] = new int[size];
        int pos = 0;
        for(int i : set){
            ans[pos++] = i;
        }
        return ans;
    }
}
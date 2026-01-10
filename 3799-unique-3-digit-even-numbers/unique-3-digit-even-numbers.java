class Solution {
    public int totalNumbers(int[] digits) {
        int len = digits.length;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < len ; i++){
            for(int j = 0; j < len ; j++){
                for(int k = 0; k < len ; k++){
                    if(digits[i]!=0 && (i!=j && j!=k && k!=i)){
                        int x = digits[i]*100 + digits[j]*10 +digits[k];
                        if(x%2==0 && !set.contains(x))
                            set.add(x);
                    }
                }
            }
        }
        return set.size();
    }
}
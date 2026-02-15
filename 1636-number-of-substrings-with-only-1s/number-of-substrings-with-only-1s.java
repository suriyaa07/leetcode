class Solution {
    public int numSub(String s) {
        long count = 0;
        long consecutiveCount = 0;
        List<Character> list = new ArrayList<>();
        for(char i : s.toCharArray()){
            if(i == '1'){
                consecutiveCount++;
            } else {
                count += consecutiveCount * (consecutiveCount + 1) / 2;
                consecutiveCount = 0;
            }
        }
        count += consecutiveCount * (consecutiveCount + 1) / 2;
        count %= 1000000007;
        return (int)count;
    }
}
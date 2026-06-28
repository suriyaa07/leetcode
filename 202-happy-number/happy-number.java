class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            if(n==1) return true;
            set.add(n);
            n = sumOfSquares(n);
        }
        return false;
    }

    public static int sumOfSquares(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans + (int)Math.pow(rem,2);
            n/=10;
        }
        return ans;
    }
}
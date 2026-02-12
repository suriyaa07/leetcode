class Solution {
    public int totalMoney(int n) {
        int rem = n % 7;
        int quo = n / 7;
        int ans = 0;
        //add the 7 numbers 
        for(int i = 0;i<quo;i++){
            ans = 1 + i + 2 + i + 3 + i + 4 + i + 5 + i + 6 + i + 7 + i + ans;
        }
        // add the remainders separately
        if(rem != 0){
            for(int i = 1; i < rem +1; i++){
                ans = i + quo + ans ;
            }
        }
    return ans;
    }
}
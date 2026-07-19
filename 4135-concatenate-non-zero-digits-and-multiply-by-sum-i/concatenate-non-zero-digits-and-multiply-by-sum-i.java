class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long ans = 0;
        long sum = 0;

        while(n>0){
            long rem = n%10;
            if(rem!=0){
                x = x *10;
                x=x+rem;
            }
            n/=10;
        }
        while(x>0){
            long rem = x%10;
            sum = sum + rem;
            ans = ans * 10;
            ans = ans + rem;
            x/=10;
        }


        return ans*sum;
    }
}
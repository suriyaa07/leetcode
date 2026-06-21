class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int rev = reverse(n);
        int min = Math.min(n,rev);
        int max = Math.max(n,rev);

        for(int i = min;i<=max;i++){
            if(isPrime(i))sum+=i;
        }

        return sum;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i = 2;i * i <=n;i++){
            if(n%i ==0) return false;
        }
        return true;
    }

    public static int reverse(int n){
        int newNum = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            newNum = (newNum*10) + rem;
        }
        return newNum;
    }
}
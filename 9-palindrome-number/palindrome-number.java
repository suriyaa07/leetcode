class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int clone = x;
        int temp = 0;
        while(x>0){
            int rem = x%10;
            temp = (temp*10) + rem;
            x/=10;
        }
        if(clone==temp) return true;
        return false;
    }
}
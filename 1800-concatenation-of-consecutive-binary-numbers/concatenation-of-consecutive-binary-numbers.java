class Solution {
    public int concatenatedBinary(int n) {
        //making a string of binary numbers from 1 to n
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            sb.append(binary);
        }
        String finalBinary = sb.toString();
        //converting binary to decimal
        long ans = 0;
        for(int i = 0;i<finalBinary.length();i++){
            int num = finalBinary.charAt(i) - '0';
            ans = (ans * 2 + num) % 1000000007;
        }
        return (int)ans;
    }
}
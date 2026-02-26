// class Solution {
//     public int numSteps(String s) {
//         long num = Long.parseLong(s,2);
//         int count = 0;
//         while(num!=1){
//             if(num%2==0){
//                 num = num/2;
//             } else {
//                 num = num +1;
//             }
//             count++;
//         }
//         return count;
//     }
// }
import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s,2);
        int count = 0;
        while(!num.equals(BigInteger.ONE)){
            if(num.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                num = num.divide(BigInteger.TWO);
            } else {
                num = num.add(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}
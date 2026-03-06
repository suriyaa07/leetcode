class Solution {
    public int minOperations(String s) {
        int count1 = 0;
        int count2 = 0;
        int len = s.length();
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(i%2==0){
                sb1.append("1");
            } else {
                sb1.append("0");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(i%2==0){
                sb2.append("0");
            } else {
                sb2.append("1");
            }
        }

        for(int i = 0;i<len;i++){
            if(s.charAt(i)!=sb1.charAt(i))
                count1++;
            if(s.charAt(i)!=sb2.charAt(i))
                count2++;
        }



        return Math.min(count1,count2);
    }
}
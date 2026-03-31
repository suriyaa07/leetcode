class Solution {
    public boolean validPalindrome(String s) {
        int s1 = 0, s2=0;
        int e1 = s.length() -1 , e2 = s.length()-1;

        //normal palendrome check
        boolean flag = true;
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(e1-i))
                flag=false;
        }
        System.out.print("flag : " +flag);
        if(flag)
            return true;
        //2 ways -> ignore one left impurity once, ignore one right impurity once
        boolean flag1 = true;
        boolean leftUse = true;
        while(s1<=e1){
            if(s.charAt(s1)!=s.charAt(e1)){
                if(leftUse){
                    leftUse = false;
                    e1--;
                    continue;
                } else {
                    flag1 = false;
                }
            }
            s1++;
            e1--;
        }

        boolean flag2 = true;
        boolean rightUse = true;
        while(s2<=e2){
            if(s.charAt(s2)!=s.charAt(e2)){
                if(rightUse){
                    rightUse = false;
                    s2++;
                    continue;
                } else {
                    flag2 = false;
                }
            }
            s2++;
            e2--;
        }

        if(flag1==true||flag2==true)
            return true;
        
    return false;
    }
}
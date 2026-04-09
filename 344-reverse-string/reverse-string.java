class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        recursion(s,i,j);
    }

    public void recursion(char[] s, int i , int j){
        if(i>=j) return ;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++; j--;
        recursion(s,i,j);
    }
}
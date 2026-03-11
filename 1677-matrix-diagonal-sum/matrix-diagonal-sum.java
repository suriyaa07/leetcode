class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        boolean odd = len%2!=0;
        int sum = 0;
        //primary diagonal;
        for(int i = 0;i<len;i++){
            sum+=mat[i][i];
        }

        //secondary diagonal
        for(int i = 0;i<len;i++){
            sum+=mat[i][len-1-i];
        }
        if(odd){
            sum-=mat[len/2][len/2];
        }
        return sum;
    }
}
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int oneRow = 0;
        int oneCount = 0;
        for(int i = 0;i<mat.length;i++){
            int current = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1)current++;
            }
            if(current>oneCount){
                oneCount = current;
                oneRow = i;
            }
        }
        return new int[]{oneRow, oneCount};
    }
}
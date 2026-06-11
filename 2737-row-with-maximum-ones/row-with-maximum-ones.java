class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int []ans = new int[2];

        int row = mat.length;
        int col = mat[0].length;

        int oneRow = 0;
        int oneCount = 0;
        for(int i = 0;i<row;i++){
            int current = 0;
            for(int j = 0;j<col;j++){
                if(mat[i][j]==1)current++;
            }
            if(current>oneCount){
                oneCount = current;
                oneRow = i;
            }
        }
        ans[0] = oneRow; 
        ans[1] = oneCount;
        return ans;
    }
}
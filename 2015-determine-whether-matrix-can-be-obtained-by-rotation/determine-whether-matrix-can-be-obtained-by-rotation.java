class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int count = 4;
    while(count>0){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }

        if(Arrays.deepEquals(mat,target))
            return true;
        else
            count--;

    }
    return false;
    }
}
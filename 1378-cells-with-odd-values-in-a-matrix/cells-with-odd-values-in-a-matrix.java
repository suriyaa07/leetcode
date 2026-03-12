class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        //empty array, initialize to zero
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = 0;
            }
        }

        int len = indices.length;
        for(int i = 0;i<len;i++){
            int r = indices[i] [0];
            int c = indices[i] [1];

            for(int x = 0;x<n;x++){
                arr[r][x] +=1;
            }
            for(int y = 0;y<m;y++){
                arr[y][c]+=1;
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j] %2!= 0)
                    count++;
            }
        }
        return count;
    }
}
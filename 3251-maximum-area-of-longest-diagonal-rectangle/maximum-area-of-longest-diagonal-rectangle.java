class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        double d_len = 0;
        int area = 0;
        double x = 0;
        for(int i = 0;i<dim.length;i++){
                x = Math.hypot(dim[i][0] , dim[i][1]);
                int mul = dim[i][0]*dim[i][1];
                if(x > d_len || (x == d_len && mul > area)){
                    d_len = x;
                    area = mul;
                }
        }
        return area;
    }
}
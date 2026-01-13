class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        double d_len = 0;
        int area = Integer.MIN_VALUE;
        int len = dim.length;
        double x = 0;
        for(int i = 0;i<len;i++){
                x = Math.hypot(dim[i][0] , dim[i][1]);
                int mul = dim[i][0]*dim[i][1];
                if(x > d_len){
                    d_len = x;
                    area = mul;
                } else if(x == d_len){
                    if(mul > area)
                        area = mul;
                    }
        }
        return area;
    }
}
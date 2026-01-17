class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int len = points.length;
        int count = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        for(int i = 0;i<len -1;i++){
            x1 = points[i][0];
            y1 = points[i][1];
            x2 = points[i+1][0];
            y2 = points[i+1][1];
            
            int dx = Math.abs(x1-x2);
            int dy = Math.abs(y1-y2);

            count += Math.max(dx, dy);
        }
        return count;
    }
}
class Solution {
    public int minCostToMoveChips(int[] position) {
        int len = position.length;
        int x = 0;
        int y = 0;
        for(int i = 0;i<len;i++){
            if(position[i]%2==0){
                x++;
            } else {
                y++;
            }
        }
        return Math.min(x,y);
    }
}
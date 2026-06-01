class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int len = cost.length;
        if(len==1) return cost[0];
        if(len==2) return cost[1]+cost[0];
        int ans = 0;
        while(len>1){
            ans = ans + cost[len-1] + cost[len-2];
            len = len - 3;
        }
        while(len>0){
            --len;
            ans = ans + cost[len];
            
        }
        return ans;
    }
}


// 1
// ans = 3 + 3
// ans = 6

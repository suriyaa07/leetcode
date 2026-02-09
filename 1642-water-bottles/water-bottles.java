class Solution {
    public int numWaterBottles(int bottle, int rate) {
        int total = bottle;

        while(bottle / rate > 0){
            int after = bottle / rate;
            int rem = bottle % rate;
            total +=after;
            bottle = after + rem;
        }
        return total;
    }
}
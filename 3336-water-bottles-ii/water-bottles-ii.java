class Solution {
    public int maxBottlesDrunk(int bottle, int rate) {
        int drank = bottle;
        int empty = bottle;
        while(empty >= rate){
            empty-=rate;drank++;empty++;rate++;
        }
        return drank;
    }
}
class Solution {
    public boolean stoneGame(int[] piles) {
        //alex chooses from first...
        int alex1 = 0;
        int bob1 = 0;
        int alex2 = 0;
        int bob2 = 0;

        for(int i = 0;i<piles.length;i++){
            if(i%2==0){
                alex1+=piles[i];
                bob2+=piles[i];
            } else {
                alex2+=piles[i];
                bob1+=piles[i];
            }
        }
        if(bob1>alex1 || bob2>alex2) return true;
        return false;
    }
}
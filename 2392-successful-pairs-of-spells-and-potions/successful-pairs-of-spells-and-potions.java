class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int result[] = new int[n];
        Arrays.sort(potions);
        
        for(int i = 0;i<n;i++){
            int spell = spells[i];
            
            int left = 0;
            int right = m-1;
            int index = m;

            long minPotion = (success + spell-1) / spell;
            while(left<=right){
                int middle = left + (right - left) /2;
                if(potions[middle] >= minPotion){
                    index = middle;
                    right = middle -1;
                } else {
                    left = middle +1;
                }
            }
            result[i] = m - index;
        }

        return result;
    }
}
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int len = energy.length;
        int max = Integer.MIN_VALUE;
        for(int i = len-1;i>=0;i--){
            if(i+k<len){
                energy[i] = energy[i] + energy[i+k];
            }
            max = Math.max(energy[i],max);
        }
        return max;
    }
}

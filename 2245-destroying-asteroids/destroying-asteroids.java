class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long answer = mass;
        Arrays.sort(asteroids);
        int len = asteroids.length;
        for(int i = 0;i<len;i++){
            if(asteroids[i]>answer)
                return false;
            answer = answer+asteroids[i];
        }
        return true;
    }
}
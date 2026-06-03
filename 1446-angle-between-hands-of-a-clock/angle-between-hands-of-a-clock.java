class Solution {
    public double angleClock(int hour, int minutes) {

        double hourAngle = 30 * hour;
        double minAngle = (double)(11*minutes)/2;
        double angle = Math.abs(hourAngle-minAngle);
        return Math.min(angle,360-angle);

        
    }
}
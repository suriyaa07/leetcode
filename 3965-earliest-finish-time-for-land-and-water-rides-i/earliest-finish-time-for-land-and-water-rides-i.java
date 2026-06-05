class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        //length
        int landLen = landStartTime.length;
        int waterLen = waterStartTime.length;
        //base possible lowest
        int lowest = landStartTime[0] + landDuration[0] + waterStartTime[0] + waterDuration[0];
        //start with land
        for(int i = 0;i<landLen;i++){
            
            for(int j = 0;j<waterLen;j++){
                int rideTime = landStartTime[i] + landDuration[i];
                if(rideTime>=waterStartTime[j]){
                    rideTime+=waterDuration[j];
                } else {
                    int waitingTime = waterStartTime[j] - (landStartTime[i] + landDuration[i]);
                    rideTime = rideTime + waitingTime + waterDuration[j];
                }
                if(rideTime<lowest) lowest = rideTime;
            }
        }
        //start with water
        for(int i = 0;i<waterLen;i++){
            for(int j = 0;j<landLen;j++){
                int rideTime = waterStartTime[i] + waterDuration[i];
                if(rideTime>=landStartTime[j]){
                    rideTime+=landDuration[j];
                } else {
                    int waitingTime = landStartTime[j] - (waterStartTime[i] + waterDuration[i]);
                    rideTime = rideTime + waitingTime + landDuration[j];
                }
                if(rideTime<lowest) lowest = rideTime;
            }
        }
        return lowest;
    }
}
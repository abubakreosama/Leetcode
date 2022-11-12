class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int timePoisoned = 0;
        for(int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i+1] - timeSeries[i] < duration) {
                timePoisoned+= timeSeries[i+1] - timeSeries[i];
            }
            else {
                timePoisoned+=duration;
            }

        }
        return timePoisoned + duration;
    }
}
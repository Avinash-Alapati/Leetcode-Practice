class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxAltitude = 0;
        int result = 0;

        for (int i = 0; i < n; i++){
            result += gain[i];
            maxAltitude  = Math.max(result , maxAltitude);
        }
        
        return maxAltitude;
    }
}
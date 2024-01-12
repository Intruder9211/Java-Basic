class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxsofar = 0;
        int maxfinal=0;
         for(int i=0;i<n;i++)
        {
        
        
        maxsofar +=gain[i];
        maxfinal = Math.max(maxfinal, maxsofar);
        
    }
    return maxfinal;
}
}

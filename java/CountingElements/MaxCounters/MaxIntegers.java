import java.lang.*;

class Solution {
    public int[] solution(int N, int[] A) {
        
        int[] counters = new int[N];

        int maxCounter = 0;
        int lastMax = 0;
        for(int i = 0; i < A.length; i++){
            if (A[i] <= N){
                int newValue = Math.max(counters[A[i]-1],lastMax);
                counters[A[i]-1] = newValue + 1;
                maxCounter = Math.max(counters[A[i]-1],maxCounter);
            } else {
                lastMax = maxCounter;
            }
        }
        for (int c = 0; c < counters.length; c++){
            counters[c] = Math.max(counters[c],lastMax);
        }
        return counters;
    }    
}
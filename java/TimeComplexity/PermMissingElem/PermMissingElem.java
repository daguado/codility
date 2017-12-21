class Solution {
    public int solution(int[] A) {
        
        int completeSum = 0;
        int arrayElementsSum = 0;
        
        for (int i = 0; i < A.length; i++) {
            completeSum += i+1;
            arrayElementsSum += A[i];
        }
        
        //Add the N + 1 value
        completeSum += A.length + 1;
        
        return completeSum - arrayElementsSum;
        
    }
}
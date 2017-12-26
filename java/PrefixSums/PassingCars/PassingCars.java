class Solution {
    public int solution(int[] A) {
        
        int numCarsTravellingWest = 0;
        int passingCars = 0;
        for (int i = A.length - 1; i >= 0; i--){
            if (A[i] == 1){
                numCarsTravellingWest++;    
            } else {
                passingCars = passingCars + numCarsTravellingWest;
                
                if (passingCars > 1000000000) {
                    return -1;    
                }
            }
        }
        return passingCars;        
    }
}
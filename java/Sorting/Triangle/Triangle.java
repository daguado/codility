import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        
        for (int i = 0; i < A.length - 2; i++){
            if (isTriangle(A[i], A[i+1], A[i+2])) {
                return 1;
            }
        }
        return 0;
    }
    
    private boolean isTriangle(int p, int q, int r){
        return (p > r - q);
    }
}
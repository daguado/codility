import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        if (A.length == 3){
            return A[0] * A[1] * A[2];    
        }
        
        Arrays.sort(A);

        return Math.max(A[0] * A[1] * A[A.length -1], A[A.length - 1] 
		* A[A.length - 2] * A[A.length - 3]);
        
    }
}

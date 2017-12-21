import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        
        HashSet<Integer> elements = new HashSet<Integer>();
        
        int validSum = 0;
        int actualSum = 0;
        for (int i = 0; i < A.length; i++) {
            actualSum += A[i];
            validSum += i + 1;
            if (elements.contains(A[i])) {
                return 0;    
            } else {
                elements.add(A[i]);    
            }
        }
        if (actualSum == validSum) {
            return 1;
        } else {
            return 0;
        }
    }
}
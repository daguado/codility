class Solution {
    public int[] solution(int[] A, int K) {
        if (K == 0 || A.length == 0) { 
            return A;
        } else {
            return solution(rotate(A), K-1);
        }
    }
    
    private int[] rotate(int[] A) {
        int[] result = new int[A.length];
        int lastElement = A[A.length -1];
        for (int i = 1; i < A.length; i++) {
            result[i] = A[i-1];
        }
        result[0] = lastElement;
        return result;
    }
}
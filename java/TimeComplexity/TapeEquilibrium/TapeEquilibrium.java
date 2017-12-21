class Solution {
    public int solution(int[] A) {
        
        int head = A[0];
        int tail = 0;
        for (int i = 1; i < A.length; i++){
            tail += A[i];    
        }
        
        int diff = Math.abs(head - tail);
        for (int i = 1; i < A.length -1; i++){
            head += A[i];
            tail -= A[i];
            
            if (Math.abs(head - tail) < diff){
                diff = Math.abs(head - tail);
            }
        }
        return diff;
    }
}
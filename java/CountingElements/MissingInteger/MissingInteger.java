import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Set<Integer> elems = new HashSet<Integer>();
        
        for (int j = 0; j < A.length; j++){
            elems.add(A[j]);
        }
        
        for (int i = 1; i <= A.length; i++) {
            if (!elems.contains(i)){
                return i;
            }
        }
        return A.length + 1;
    }
}